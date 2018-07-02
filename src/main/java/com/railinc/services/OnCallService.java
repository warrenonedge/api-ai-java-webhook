package com.railinc.services;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.railinc.dao.OnCallReader;
import com.railinc.entities.OnCall;

@Service
public class OnCallService {

	// @Autowired
	// OnCallDao onCallDao;

	private List<OnCall> allOnCall;

	@PostConstruct
	public void init() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File onCallFile = new File(classLoader.getResource("oncall.csv").getFile());
		this.allOnCall = OnCallReader.readFile(onCallFile);
	}

	public List<OnCall> findByOnCallDate(String date) {
		// return onCallDao.findByOnCallDate(date);
		
		return this.allOnCall.stream().filter(p -> p.getOnCallDate().equals(date)).collect(Collectors.toList());
	}

	public List<OnCall> findByOnCallDateBetween(String startDate, String endDate) {
		// return onCallDao.findByOnCallDateBetween(startDate, endDate);
		
		return this.allOnCall.stream().filter(p -> {
			try {
				return isBetween(startDate, endDate, p.getOnCallDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return false;
		}).collect(Collectors.toList());
	}
	
	private boolean isBetween(String startDate, String endDate, String checkDate) throws ParseException {
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");

        Date convStartDate = df.parse(startDate);
        Date convEndDate = df.parse(endDate);
        Date convCheckDate = df.parse(checkDate);
        
        return convCheckDate.after(convStartDate) && convCheckDate.before(convEndDate); 
	}
}
