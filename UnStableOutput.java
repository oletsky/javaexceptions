package javatraining.oletsky.exceptions;

/**
 * @author O.Oletsky
 * What will be outputted?
 */

public class UnStableOutput {
    public static void main(String[] args) {
        try {
            System.out.println("You are welcome");
            System.exit(0);
        }
        finally {
            System.out.println("Get off me!");
        }
    }
}
