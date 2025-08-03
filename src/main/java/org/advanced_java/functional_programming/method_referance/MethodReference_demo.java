package org.advanced_java.functional_programming.method_referance;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference_demo {
    public static void main(String[] args) {
        List<String> playerNames = Arrays.asList("Ram", "Shyam", "MS", "Rahul", "Sourav");
//        playerNames.forEach(x -> System.out.println(x));
//        CollectionUtility.outputDivider();
        //this is method reference
//        playerNames.forEach(System.out::println);
 //       playerNames.forEach(MethodReference_demo::upper);
 //       CollectionUtility.outputDivider();
        List<Player> playerList = playerNames.stream().map(Player::new).collect(Collectors.toList());
        playerList.forEach(System.out::println);
    }

    public static void upper(String x) {
        x = x.toUpperCase();
        System.out.println(x);
    }
}

class Player {
    @Override
    public String toString() {
        return STR."Player{name='\{name}'}";
    }

    String name;

    public Player(String s) {
        this.name = s;
    }
}