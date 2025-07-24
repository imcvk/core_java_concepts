package org.advanced_java.collections.learning.map_interface.immutable_map;

import org.advanced_java.collections.learning.collection_utility.CollectionUtility;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		map.put("key6", "value6");
		Map<String, String> map2 = Collections.unmodifiableMap(map);
		System.out.println(map2);

		Map<String, String> testMap = Map.of("key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4");
		CollectionUtility.outputDivider();
		System.out.println(testMap);
		
	}
}
