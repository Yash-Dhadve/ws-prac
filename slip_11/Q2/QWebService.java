package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public String convert(int number, String type) {

        if(type.equalsIgnoreCase("binary")) {
            return Integer.toBinaryString(number);
        }
        else if(type.equalsIgnoreCase("octal")) {
            return Integer.toOctalString(number);
        }
        else if(type.equalsIgnoreCase("hexa")) {
            return Integer.toHexString(number);
        }

        return "Invalid Type";
    }

}
