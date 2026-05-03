package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public double area(double length, double width) {

        return length * width;
    }

    public double volume(double length, double width, double height) {

        return length * width * height;
    }
}
