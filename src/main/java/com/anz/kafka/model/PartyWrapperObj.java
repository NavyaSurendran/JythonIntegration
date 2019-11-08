package com.anz.kafka.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PartyWrapperBObj")
@XmlType(propOrder = { "componentId",  "tcrmPersonBObj"})
public class PartyWrapperObj {

	private String componentId;
	private TCRMPersonBObj tcrmPersonBObj;
	
	public String getComponentId() {
		return componentId;
	}
	@XmlElement(name = "componentId")
	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}
	public TCRMPersonBObj getTcrmPersonBObj() {
		return tcrmPersonBObj;
	}
	
	@XmlElement(name = "tcrmPersonBObj")
	public void setTcrmPersonBObj(TCRMPersonBObj tcrmPersonBObj) {
		this.tcrmPersonBObj = tcrmPersonBObj;
	}
	
	
	
}
