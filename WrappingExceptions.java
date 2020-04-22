package javatraining.oletsky.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author O.Oletsky
 * Wrapping checked exceptions into unchecked
 */

public class WrappingExceptions {
    public static void main(String[] args) {
        System.out.println(new Sub().getData());
    }

}

abstract class Base{
    abstract String getData();
}

class Sub extends Base {

    @Override
    String getData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s = null;
        try {
            s = br.readLine();
            return s;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

