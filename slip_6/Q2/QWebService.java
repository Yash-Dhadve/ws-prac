package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public boolean validate(String username, String password) {

        if(username.equals("admin") &&
           password.equals("123")) {

            return true;
        }

        return false;
    }
}
