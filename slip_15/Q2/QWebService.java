package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public boolean validate(String email) {

        String pattern =
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        return email.matches(pattern);
    }
}
