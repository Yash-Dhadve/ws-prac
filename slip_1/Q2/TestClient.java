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
                port.convert("dollar", 8500);

        System.out.println("Converted Amount = " + result);
    }
}