package com.railinc.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railinc.dao.OnCallDao;
import com.railinc.entities.OnCall;

@Service
public class OnCallService {
	
	@Autowired
	OnCallDao onCallDao;
	
	
	public OnCall findByOnCall_Date(Date date) {
		return onCallDao.findByOnCall_Date(date);
	}
	
	public List<OnCall> findByOnCall_DateBetween(Date startDate, Date endDate) {
		return onCallDao.findByOnCall_DateBetween(startDate, endDate);
	}
}
