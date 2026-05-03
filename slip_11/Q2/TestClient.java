package client;

import client.QWebService;
import client.QWebServiceService;

public class TestClient {

    public static void main(String[] args) {

    	QWebServiceService service =
                new QWebServiceService();

        QWebService port =
                service.getQWebServicePort();

        String result =
                port.convert(7, "binary");

        System.out.println("Converted Number = " + result);
    }
}