package javatraining.oletsky.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhatToDoWithHandlingException {
    public static void main(String[] args) {
        System.out.println(new Sub1().getData());
    }

}

abstract class Base1{
    abstract String getData();
}

class Sub1 extends Base1 {

    @Override
    String getData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s = br.readLine();
        return s;
    }
}
