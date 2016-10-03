package com.invensense.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class CrmodDateFormater extends XmlAdapter<String, Date> {
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public String marshal(Date d) throws Exception {
		return dateFormat.format(d);
	}

	@Override
	public Date unmarshal(String d) throws Exception {
		return dateFormat.parse(d);
	}

}
