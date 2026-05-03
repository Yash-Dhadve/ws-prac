package client;

import client.QWebService;
import client.QWebServiceService;

public class TestClient {

    public static void main(String[] args) {

    	QWebServiceService service =
                new QWebServiceService();

        QWebService port =
                service.getQWebServicePort();

        double area =
                port.area(10, 5);

        double volume =
                port.volume(10, 5, 2);

        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
    }
}