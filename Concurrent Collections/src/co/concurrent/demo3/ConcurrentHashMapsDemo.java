package co.concurrent.demo3;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapsDemo {
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String>cmap=new ConcurrentHashMap<String, String>();
		
		cmap.put("India", "Delhi");
		cmap.put("Japan", "Tokyo");
		cmap.put("USA", "Washington");
		cmap.put("Russia", "Moscow");
		cmap.put("Germany", "Berlin");
		
		System.out.println("concurrent Hash Map content: "+cmap);
		
		
		cmap.putIfAbsent("China", "Beijing");
		
		System.out.println("concurrent Hash Map content: "+cmap);
		
		
		cmap.replace("India", "Delhi", "New Delhi");
		
		System.out.println("concurrent Hash Map content: "+cmap);
		
		
		Iterator<String>it=cmap.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			if(key.equals("Germany")) {cmap.put("Switzerland", "Bern");}
		}
		
		System.out.println("concurrent Hash Map content: "+cmap);
		
		
		
		
		
		
		
		
		
		
	}

}
