package com.railinc.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.railinc.entities.OnCall;
import com.railinc.entities.webhook.request.Parameters;
import com.railinc.entities.webhook.request.WebhookRequest;
import com.railinc.entities.webhook.response.WebhookResponse;
import com.railinc.services.OnCallService;

@Controller
@RequestMapping("/webhook")
public class RailIncOnCallController {
	
	@Autowired
	OnCallService onCallService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody WebhookRequest whr) throws ParseException{

        System.out.println(whr);
        
        Parameters parms = whr.getQueryResult().getParameters();
        
        Calendar iso8601Date = javax.xml.bind.DatatypeConverter.parseDateTime(parms.getDate());
        
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        Date result =  iso8601Date.getTime();
        
        System.out.println(df.format(result));
        
        OnCall onCall = onCallService.findByOnCallDate(df.format(result)).get(0);
        
        System.out.println(onCall);
        
        DateFormat readableDf = new SimpleDateFormat("MMMM dd");
        
        String resultText = "The User on Call for " + readableDf.format(result) + " is " + onCall.getName(); 

        return new WebhookResponse(resultText);
    }
}
