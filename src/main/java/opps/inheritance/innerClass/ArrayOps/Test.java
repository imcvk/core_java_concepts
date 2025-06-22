package opps.inheritance.innerClass.ArrayOps;

public class Test {
    public static void main(String[] args) {
        ArrayOperation arrayOperation = new ArrayOperation(new int[]{1, 5, 89, 6});
        ArrayOperation.Stats stats = arrayOperation.new Stats();
        System.out.println(stats.mean());
    }
}
