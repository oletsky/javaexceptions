package javatraining.oletsky.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManyCatchesForDoubleParsing {
    public static void main(String[] args) {
        System.out.println("Enter the double value");
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            double d = Double.parseDouble(s);
            double dexp = Math.exp(d);
            System.out.println("Result is "+dexp);
        }
        catch (IOException ioe) {System.out.println("Input error");}

        catch (NumberFormatException ioe) {
            System.out.println ("Please enter the proper value");
        }
        catch (ArithmeticException are) {
            System.out.println("Error in calculations ");
        }

        catch (Exception e) {
            System.out.println ("Something strange and unbelievable");
        }

    }
}
