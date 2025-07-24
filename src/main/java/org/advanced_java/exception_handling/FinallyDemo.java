package org.advanced_java.exception_handling;

public class FinallyDemo {
    void finallyDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally Demo");
        }
    }

    public static void main(String[] args) {
        FinallyDemo demo = new FinallyDemo();
        demo.finallyDemo();
    }
}
