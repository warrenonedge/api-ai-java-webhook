package com.railinc.entities;

import java.util.Date;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class OnCall {
	
	//@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="id")
    private Integer id;
	private String name;
	//@Column(name="ONCALL_DATE")
	private String onCallDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getOnCallDate() {
		return onCallDate;
	}
	public void setOnCallDate(String onCallDate) {
		this.onCallDate = onCallDate;
	}
	@Override
	public String toString() {
		return "OnCall [id=" + id + ", name=" + name + ", onCallDate=" + onCallDate + "]";
	}


}
