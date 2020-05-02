package javatraining.oletsky.exceptions;

import java.util.ArrayList;

/**
 * @author O.Oletsky
 * A strange situation when an instance has been created
 * even though an exception had been thrown on creating
 */
public class AfterAbruptConstruction {

    public static void main(String[] args) {
        ArrayList<AbruptClass> list = new ArrayList<>();

        try {
            AbruptClass c = new AbruptClass(list);
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
        list.get(0).foo();
        System.out.println(list.get(0).n);

    }
}

class AbruptClass {

    int n;

    public AbruptClass(
            ArrayList<AbruptClass> list
    ) {
        list.add(this);
        throw new RuntimeException();
    }

    void foo() {
        System.out.println("Instance exists");
    }
}
