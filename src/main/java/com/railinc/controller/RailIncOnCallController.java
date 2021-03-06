package com.railinc.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.railinc.entities.OnCall;
import com.railinc.entities.webhook.request.DatePeriod;
import com.railinc.entities.webhook.request.Parameters;
import com.railinc.entities.webhook.request.WebhookRequest;
import com.railinc.entities.webhook.response.WebhookResponse;
import com.railinc.services.OnCallService;

@Controller
@RequestMapping("/webhook")
public class RailIncOnCallController {
	
	@Autowired
	OnCallService onCallService;
	
	@Autowired
	Gson gson;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody WebhookRequest whr) throws Exception{
    	String resultText = "";
    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    	DateFormat readableDf = new SimpleDateFormat("MMMM d");
    	Date todaysDate = new Date();
       
        Parameters params = whr.getQueryResult().getParameters();
        System.out.println(params);
        
        if (params.getOncallEntity() == null) {
        	throw new Exception("Invalid Paramaters");
        }
        
        
        if (params.getDatePeriod() != null && params.getDatePeriod() instanceof LinkedTreeMap) {
        	//ObjectMapper mapper = new ObjectMapper();
        	//DatePeriod datePeriod = mapper.treeToValue(params.getDatePeriod(), DatePeriod.class);
        	String datePeriod = this.gson.toJson(params.getDatePeriod());
        	
        	DatePeriod dp = this.gson.fromJson(datePeriod, DatePeriod.class);
        	
	        Calendar iso8601StartDate = DatatypeConverter.parseDateTime(dp.getStartDate());
	        Calendar iso8601EndDate = DatatypeConverter.parseDateTime(dp.getEndDate());
	        List<OnCall> allOnCall = onCallService.findByOnCallDateBetween(df.format(iso8601StartDate.getTime()), df.format(iso8601EndDate.getTime()));

	        System.out.println("Len: " + allOnCall.size());
	        
	        resultText = (allOnCall.size() > 0) ? "Users on call:" : "";
	        
	        for (OnCall onCall : allOnCall) {
	        	Calendar cal = Calendar.getInstance();
	        	cal.setTime(df.parse(onCall.getOnCallDate()));
	        	resultText += "\n" + onCall.getName() + "\t " + readableDf.format(df.parse(onCall.getOnCallDate())) + getDateSuffix(cal.get(Calendar.DAY_OF_MONTH));
	        }

        }
        else if (!params.getDate().equals("")) {
	        Calendar iso8601Date = DatatypeConverter.parseDateTime(params.getDate());
	       
	        Date result =  iso8601Date.getTime();
	        String tense = (result.after(todaysDate)) ? " is " : " was ";
	        try {
    	        OnCall onCall = onCallService.findByOnCallDate(df.format(result)).get(0);
    	        Calendar cal = Calendar.getInstance();
	        	cal.setTime(result);
    	        resultText = "The User on Call for " + readableDf.format(result) + getDateSuffix(cal.get(Calendar.DAY_OF_MONTH)) + tense + onCall.getName();
        	} catch (IndexOutOfBoundsException ex) {
        		resultText = "There is No User on Call";
        	}
        }
        else {
        	try {
    	        OnCall onCall = onCallService.findByOnCallDate(df.format(todaysDate)).get(0);
    	        Calendar cal = Calendar.getInstance();
	        	cal.setTime(todaysDate);
    	        resultText = "The User on Call for " + readableDf.format(todaysDate) + getDateSuffix(cal.get(Calendar.DAY_OF_MONTH)) + " is " + onCall.getName();
        	} catch (IndexOutOfBoundsException ex) {
        		resultText = "There is No User on Call";
        	}
        }

        return new WebhookResponse(resultText);
    }
    
    
    public String getDateSuffix( int day) { 
    	System.out.println("day: " + day);
    	switch (day) {
        case 1: case 21: case 31:
               return ("st");

        case 2: case 22: 
               return ("nd");

        case 3: case 23:
               return ("rd");

        default:
               return ("th");
    }
}
}
