package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public double calculate(
            double m1,
            double m2,
            double m3,
            double m4,
            double m5) {

        double total =
                m1 + m2 + m3 + m4 + m5;

        return total / 5;
    }

}
