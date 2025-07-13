package org.collections.collections_library.list_Interface.stack;

import org.collections.collections_library.collection_utility.CollectionUtility;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack = CollectionUtility.getCityList(Stack::new);
        stack.forEach(System.out::println);
        CollectionUtility.outputDivider();
        stack.add("Pune");
        stack.remove("Pune");
        System.out.println(stack);
        CollectionUtility.outputDivider();
        System.out.println("Stack push:" + stack.push("Mumbai"));
        CollectionUtility.outputDivider();
        System.out.println(stack);
        CollectionUtility.outputDivider();
        System.out.println("Stack pop:" + stack.pop());
        CollectionUtility.outputDivider();
        System.out.println("Stack peek:" + stack.peek());
        CollectionUtility.outputDivider();
        System.out.println("Stack Search:" + stack.search("Mumbai"));
        CollectionUtility.outputDivider();
    }
}
