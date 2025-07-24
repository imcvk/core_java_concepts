package org.advanced_java.functional_programming.LambdaExpression.lambdaDemo;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    public List<Hotel> getHotels() {
        Hotel hotel1 = new Hotel("Hotel A", "New York", 5, 200);
        Hotel hotel2 = new Hotel("Hotel B", "Los Angeles", 4, 150);
        Hotel hotel3 = new Hotel("Hotel C", "Chicago", 3, 100);
        Hotel hotel4 = new Hotel("Hotel D", "Miami", 2, 250);
        Hotel hotel5 = new Hotel("Hotel E", "San Francisco", 4, 180);
        Hotel hotel6 = new Hotel("Hotel f", "Los Angeles", 4, 150);
        Hotel hotel7 = new Hotel("Hotel g", "Chicago", 3, 100);
        Hotel hotel8 = new Hotel("Hotel h", "Miami", 2, 250);
        Hotel hotel9 = new Hotel("Hotel i", "San Francisco", 4, 180);
        return new ArrayList<>(List.of(hotel1, hotel2, hotel3, hotel4, hotel5, hotel6, hotel7, hotel8, hotel9));
    }
}
