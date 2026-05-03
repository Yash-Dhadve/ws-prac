package client;

import client.QWebService;
import client.QWebServiceService;

public class TestClient {

    public static void main(String[] args) {

    	QWebServiceService service =
                new QWebServiceService();

        QWebService port =
                service.getQWebServicePort();

        int result =
                port.countVowels("Hello Yash");

        System.out.println("Total Vowels = " + result);
    }
}