package org.advanced_java.functional_programming.supplier_demo.use_cases;

import org.apache.poi.ss.formula.functions.T;

import java.util.function.Supplier;

class ExpensiveResource {
    public ExpensiveResource() {
        System.out.println("ExpensiveObject created!");
    }

    public static void accessThisExpensiveMethod() {
        System.out.println("Expensive method accessed");
    }
}


public class LazyLoader {
    public static void main(String[] args) {

        Supplier<ExpensiveResource> initExpensiveObject = () -> {
            ExpensiveResource expensiveResource = new ExpensiveResource();
            return expensiveResource;
        };
        System.out.println(initExpensiveObject.get());
    }
}
