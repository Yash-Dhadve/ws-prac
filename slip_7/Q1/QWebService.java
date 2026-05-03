package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public double convert(double kg) {

        return kg * 1000;
    }
}
