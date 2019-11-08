package com.anz.kafka.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "TCRMPersonBObj")
@XmlType(propOrder = { "partyId",  "displayName", "partyType", "createdDate", "xPersonBObjExt"})
public class TCRMPersonBObj {

	private String partyId;
	private String displayName;
	private String partyType;
	private String createdDate;
	private XPersonBObjExt xPersonBObjExt;
	
	public String getPartyId() {
		return partyId;
	}
	
	@XmlElement(name = "partyId")
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getDisplayName() {
		return displayName;
	}
	
	@XmlElement(name = "displayName")
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getPartyType() {
		return partyType;
	}
	
	@XmlElement(name = "partyType")
	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	
	@XmlElement(name = "createdDate")
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public XPersonBObjExt getxPersonBObjExt() {
		return xPersonBObjExt;
	}
	
	@XmlElement(name = "xPersonBObjExt")
	public void setxPersonBObjExt(XPersonBObjExt xPersonBObjExt) {
		this.xPersonBObjExt = xPersonBObjExt;
	}
	
	
	
}
