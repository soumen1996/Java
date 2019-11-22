package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Kukku", 998014);
		hm.put("Mala", 678941);
		hm.put("Sheela", 787897);
		hm.put(null, 456789);
		
		HashMap hm1 = new HashMap();
		hm1.put("Deepu", 789099);
		hm1.put("riya", 678909);
		hm1.put("Kirti", 467787);
		
		boolean hasKey = hm.containsKey("Mala");
		System.out.println("Has Key "+hasKey);
		
		System.out.println("====================");
		
		boolean hasValue = hm.containsValue(789789);
		System.out.println("Has Value "+hasValue);
		
		hm.putAll(hm1);
		System.out.println("================");
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm);
		
		}
}
