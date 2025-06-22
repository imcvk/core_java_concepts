package collections_and_generics.collections_library.Enum;

public class EnumDemo {
    public static void main(String[] args) {
        TrafficLight color=TrafficLight.BLUE;
       for (TrafficLight c : TrafficLight.values()){
           System.out.println(c);
       }
    }
}


