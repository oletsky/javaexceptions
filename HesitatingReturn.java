package javatraining.oletsky.exceptions;

/**
 * @author O.Oletsky
 * What will be outputted: true or false;
 */

public class HesitatingReturn {
    public static void main(String[] args) {
        System.out.println(hesitate());
    }

    static public boolean hesitate() {
        try {
            return true;
        }
        finally {
            return false;
        }
    }
}
