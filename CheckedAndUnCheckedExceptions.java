package javatraining.oletsky.exceptions;

/**
 * @author O.Oletsky
 * Illustrating the difference between checked and unchecked exceptions
 */

public class CheckedAndUnCheckedExceptions {
    public static void main(String[] args) {
        // throw new Exception(); Syntax error
        throw new RuntimeException("This was planned"); //Compiler doesn't care this
    }
}
