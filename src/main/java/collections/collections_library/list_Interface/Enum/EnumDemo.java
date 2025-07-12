package collections.collections_library.list_Interface.Enum;

public class EnumDemo {
    public static void main(String[] args) {
        TrafficLight color=TrafficLight.BLUE;
       for (TrafficLight c : TrafficLight.values()){
           System.out.println(c);
       }
    }
}


