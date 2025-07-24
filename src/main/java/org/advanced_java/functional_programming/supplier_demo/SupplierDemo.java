package org.advanced_java.functional_programming.supplier_demo;

import net.datafaker.Faker;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
//		Supplier<?> supplyString = () -> {
//			return "Supplier";
//		};
//		System.out.println(supplyString.get());
//		Supplier<String> getGod = () -> {
//			return new Faker().ancient().god().trim();
//		};
//		System.out.println(getGod.get());
//		Supplier<Integer> testInt = () -> {
//			return 5 * 5;
//		};
//		System.out.println(testInt.get());
		Supplier<String> getRandomName=()->{
			return new Faker().name().firstName().toString();
		};
		System.out.println(getRandomName.get());
	}
}
