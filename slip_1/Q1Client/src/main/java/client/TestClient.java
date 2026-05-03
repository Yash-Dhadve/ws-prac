package client;

import client.FactorialService;
import client.FactorialServiceService;

public class TestClient {

    public static void main(String[] args) {

        FactorialServiceService service =
                new FactorialServiceService();

        FactorialService port =
                service.getFactorialServicePort();

        long result = port.factorial(5);

        System.out.println("Factorial = " + result);
    }
}