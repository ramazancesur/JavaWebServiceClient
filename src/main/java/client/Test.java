package client;

import test.SoapResponder;
import test.SoapResponderPortType;

import java.util.Scanner;


/**
 * Created by Ramazan on 6.8.2016.
 */
public class Test {
    public String soapClientTest(String value1,String value2){
        SoapResponder soapResponder=new SoapResponder();
        SoapResponderPortType soapResponderPortType=soapResponder.getSoapResponderPortType();
        String result=soapResponderPortType.method1(value1,value2);
        return result;
    }
    public static void main(String[] args) {
        Test test=new Test();
        String value1,value2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk değeri girin: ");
        value1=scanner.nextLine();
        System.out.print("ikinci değeri girin: ");
        value2=scanner.nextLine();
        System.out.println(test.soapClientTest(value1,value2));
    }
}
