package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public String greet(String name) {

        int hour = LocalTime.now().getHour();

        String msg;

        if(hour < 12) {
            msg = "Good Morning ";
        }
        else if(hour < 17) {
            msg = "Good Afternoon ";
        }
        else {
            msg = "Good Evening ";
        }

        return msg + name;
    }
}
