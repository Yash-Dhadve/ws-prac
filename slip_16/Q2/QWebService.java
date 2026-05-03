package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public double getPrice(String item) {

        if(item.equalsIgnoreCase("pen")) {
            return 10;
        }
        else if(item.equalsIgnoreCase("pencil")) {
            return 5;
        }
        else if(item.equalsIgnoreCase("notebook")) {
            return 50;
        }
        else if(item.equalsIgnoreCase("eraser")) {
            return 8;
        }

        return 0;
    }
}
