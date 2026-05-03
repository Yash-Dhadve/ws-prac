package com.project.service;

import java.time.LocalTime;

import javax.jws.WebService;

@WebService
public class QWebService {

	public int countVowels(String text) {

        int count = 0;

        text = text.toLowerCase();

        for(int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' ||
               ch=='o' || ch=='u') {

                count++;
            }
        }

        return count;
    }
}
