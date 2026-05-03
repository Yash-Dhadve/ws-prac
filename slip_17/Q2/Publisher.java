package com.project.service;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:9090/abc",
                new QWebService()
        );

        System.out.println("Service Started...");
    }
}