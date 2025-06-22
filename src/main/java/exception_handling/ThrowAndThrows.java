package exception_handling;

public class ThrowAndThrows {
    void throwsDemo() throws IllegalArgumentException {
        String demo = "no";
        if (demo.equals("no")) {
            throw new IllegalArgumentException("use of throws and throw");
        }
    }

    public static void main(String[] args) {
        ThrowAndThrows t = new ThrowAndThrows();
        t.throwsDemo();
    }
}
