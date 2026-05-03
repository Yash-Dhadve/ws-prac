package com.project.service;

import javax.jws.WebService;

@WebService
public class QWebService {

	public double convert(String type, double rupees) {

        if(type.equalsIgnoreCase("dollar")) {
            return rupees / 85;
        }
        else if(type.equalsIgnoreCase("pound")) {
            return rupees / 110;
        }
        else if(type.equalsIgnoreCase("euro")) {
            return rupees / 95;
        }

        return 0;
	}
}
