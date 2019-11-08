package com.anz.kafka.controllers;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.kafka.model.Party;

@RestController
@RequestMapping(path="/transformers")
public class MessageTransformationController {

	@GetMapping(path="/api",produces=MediaType.APPLICATION_XML_VALUE)
	public String transformJsonToXML(@RequestBody final Party party) throws JAXBException {
		org.example.party.Party partymax= new org.example.party.Party();
		partymax.setPartyType(party.getPartyType());
		partymax.setOcvId(party.getPartyId());
		JAXBContext context = JAXBContext.newInstance(org.example.party.Party.class);
		Marshaller mar= context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		StringWriter writer = new StringWriter();
		mar.marshal(partymax, writer);
		String custString = writer.toString();
		return custString;
	}
	 
	
	
}
