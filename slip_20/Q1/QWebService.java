package com.project.service;

import javax.jws.WebService;

@WebService
public class QWebService {

    public long factorial(int n) {

        long fact = 1;

        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
