package com.anz.kafka.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "party")
@XmlType(propOrder = { "partyId", "partyType", "emailId",  "organizationType"})
public class Party {

	private String partyId;
	private String partyType;
	private String emailId;
	private String organizationType;
	
	
	public String getPartyId() {
		return partyId;
	}
	
	@XmlElement(name = "partyId")
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	
	public String getPartyType() {
		return partyType;
	}
	
	@XmlElement(name = "partyType")
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	@XmlElement(name = "emailId")
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getOrganizationType() {
		return organizationType;
	}
	
	@XmlElement(name = "organizationType")
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	
	
}
