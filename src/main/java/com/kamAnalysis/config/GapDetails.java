package com.kamAnalysis.config;

import java.util.Date;

public class GapDetails {

	private String isGapClose;

	private Date dateSelected;

	public GapDetails() {
	}

	public GapDetails(String isGapClose, Date dateSelected) {
		super();
		this.isGapClose = isGapClose;
		this.dateSelected = dateSelected;
	}

	public String getIsGapClose() {
		return isGapClose;
	}

	public void setIsGapClose(String isGapClose) {
		this.isGapClose = isGapClose;
	}

	public Date getDateSelected() {
		return dateSelected;
	}

	public void setDateSelected(Date dateSelected) {
		this.dateSelected = dateSelected;
	}

	@Override
	public String toString() {
		return "Person [isGapClose=" + isGapClose + ", dateSelected=" + dateSelected + "]";
	}

}
