package client;

import client.QWebService;
import client.QWebServiceService;

public class TestClient {

    public static void main(String[] args) {

    	QWebServiceService service =
                new QWebServiceService();

        QWebService port =
                service.getQWebServicePort();

        double result =
                port.getPrice("notebook");

        System.out.println("Price = " + result);
    }
}