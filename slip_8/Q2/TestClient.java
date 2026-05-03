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
                port.calculate(80, 90, 85, 70, 95);

        System.out.println("Percentage = " + result);
    }
}