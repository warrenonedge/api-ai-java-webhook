package com.railinc.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.railinc.entities.OnCall;

@Transactional
public interface OnCallDao extends Repository<OnCall, Long> {
	
	OnCall findByOnCall_Date(Date date);
	
	List<OnCall> findByOnCall_DateBetween(Date startDate, Date endDate);
}

