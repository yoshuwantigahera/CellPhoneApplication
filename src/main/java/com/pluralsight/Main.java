package com.pluralsight;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        CellPhone phone = new CellPhone();

        System.out.print("Serial #: ");
       phone.setSerialNum(myScanner.nextInt());
       myScanner.nextLine();

        System.out.print("model: ");
        phone.setModel(myScanner.nextLine());

        System.out.print("carrier: ");
       phone.setCarrier(myScanner.nextLine());

        System.out.print("Phone Number: ");
        phone.setPhoneNum(myScanner.nextLine());

        System.out.print("Owner: ");
        phone.setOwner(myScanner.nextLine());
        myScanner.close();

        System.out.println("costumer info: ");

        System.out.println("Serial number: " + phone.getSerialNum());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNum());
        System.out.println("Owner: " + phone.getOwner());

        phone.dial(phone.getPhoneNum());

        CellPhone num1 = new CellPhone();
        num1.setPhoneNum("602-369-5185");
        num1.getOwner();
        num1.setOwner("Steve Harvey");

        CellPhone num2 = new CellPhone();
        num2.setPhoneNum("702-234-2343");
        num2.setOwner("Lori Harvey");

        display(num1);
        display(num2);

        num1.dial(num2.getPhoneNum());
        num2.dial(num1.getPhoneNum());
        //System.out.println(num2.dial(num2.getOwner() + num1.getPhoneNum()));

    }

    public static void display(CellPhone phone){

    }


}