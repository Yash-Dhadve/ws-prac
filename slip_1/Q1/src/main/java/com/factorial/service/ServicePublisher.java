package com.factorial.service;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:8081/factorialservice",
                new FactorialService()
        );

        System.out.println("Service Started...");
    }
}