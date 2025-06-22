package interview_questions;

public class SwapVariableWithoutThirdVar {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
