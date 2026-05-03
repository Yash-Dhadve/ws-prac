package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public boolean validate(String mobile) {

        String pattern = "^[0-9]{10}$";

        return mobile.matches(pattern);
    }

}
