package com.railinc.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.railinc.entities.OnCall;
import com.railinc.entities.webhook.Parameters;
import com.railinc.entities.webhook.WebhookRequest;
import com.railinc.entities.webhook.WebhookResponse;
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
        
        DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
        Date result =  df.parse(parms.getDate());
        
        OnCall onCall = onCallService.findByOnCall_Date(result);
        
        DateFormat readableDf = new SimpleDateFormat("MMMM DD");
        
        String resultText = "The User on Call for" + readableDf.format(result) + "is " + onCall.getName();

        return new WebhookResponse(resultText,resultText);
    }
}
