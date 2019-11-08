package com.anz.kafka.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "XPersonBObjExt")
@XmlType(propOrder = { "xEmployeeIndicator",  "xKycStatusType", "xKycStatusValue"})
public class XPersonBObjExt {

	private String xEmployeeIndicator;
	private String xKycStatusType;
	private String xKycStatusValue;
	
	
	public String getxEmployeeIndicator() {
		return xEmployeeIndicator;
	}
	
	@XmlElement(name = "xEmployeeIndicator")
	public void setxEmployeeIndicator(String xEmployeeIndicator) {
		this.xEmployeeIndicator = xEmployeeIndicator;
	}
	public String getxKycStatusType() {
		return xKycStatusType;
	}
	
	@XmlElement(name = "xKycStatusType")
	public void setxKycStatusType(String xKycStatusType) {
		this.xKycStatusType = xKycStatusType;
	}
	public String getxKycStatusValue() {
		return xKycStatusValue;
	}
	
	@XmlElement(name = "xKycStatusValue")
	public void setxKycStatusValue(String xKycStatusValue) {
		this.xKycStatusValue = xKycStatusValue;
	}
	
	
	
}
