package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		
		lh.put("Patna", 880000);
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 134203);
		
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is"+ key);
			System.out.println("Value is"+ value);
			System.out.println("=================");
			
		}
	}

}
