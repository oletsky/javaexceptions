package javatraining.oletsky.exceptions;

/**
 * @author O.Oletsky
 * It was promised that the argument of ServiceClass.importantMethod
 * may be 1 or 2 only.
 * But everything may happen.
 * What would you write in the default section?
 */
public class ChoosingCheckedOrUnchecked {
    public static void main(String[] args) {
        new OtherClass().useImportantMethod(3);
    }
}

class ServiceClass {
    public void importantMethod(int x) {
        switch (x) {
            case 1:
                System.out.println("First case");
                break;
            case 2:
                System.out.println("Second case");
                break;
            default: //Everything may happen... What to do?

        }
    }
}

class OtherClass {
    public void useImportantMethod(int x) {
        new ServiceClass().importantMethod(x);
    }
}
