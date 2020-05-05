package javatraining.oletsky.exceptions;

public class DemoBasicException {
    public static void main(String[] args) {
        int n=0;
        try {
            int v=100/n;
            System.out.println(v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
