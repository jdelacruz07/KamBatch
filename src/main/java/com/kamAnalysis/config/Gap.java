package com.kamAnalysis.config;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Gap {

	@Id
	private String Id;
	private String gapClose;
	private Date dateSelected;

	public Gap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gap(String gapClose, Date dateSelected) {
		super();
		this.gapClose = gapClose;
		this.dateSelected = dateSelected;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getGapClose() {
		return gapClose;
	}

	public void setGapClose(String gapClose) {
		this.gapClose = gapClose;
	}

	public Date getDateSelected() {
		return dateSelected;
	}

	public void setDateSelected(Date dateSelected) {
		this.dateSelected = dateSelected;
	}

	@Override
	public String toString() {
		return "Gap [Id=" + Id + ", gapClose=" + gapClose + ", dateSelected=" + dateSelected + "]";
	}

}
