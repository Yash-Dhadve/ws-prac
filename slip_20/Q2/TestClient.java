package client;

import client.QWebService;
import client.QWebServiceService;

public class TestClient {

    public static void main(String[] args) {

    	QWebServiceService service =
                new QWebServiceService();

        QWebService port =
                service.getQWebServicePort();

        boolean result =
                port.validate("9876543210");

        System.out.println("Valid Mobile = " + result);
    }
}