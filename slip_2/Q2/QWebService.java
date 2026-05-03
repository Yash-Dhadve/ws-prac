package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public double convert(double celsius) {

        return (celsius * 9 / 5) + 32;
    }
}
