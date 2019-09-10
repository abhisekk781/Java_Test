package co.concurrent.demo3;

import java.util.concurrent.ConcurrentHashMap;

public class ConcHashMapdemo2 {
	public static void main(String[] args) {
		
ConcurrentHashMap<String, String>cmap=new ConcurrentHashMap<String, String>();
		
		cmap.put("India", "Delhi");
		cmap.put("Japan", "Tokyo");
		cmap.put("USA", "Washington");
		cmap.put("Russia", "Moscow");
		cmap.put("Germany", "Berlin");
		cmap.put("China", "Beijing");
		cmap.put("Sri Lanka", "Colombo");
		
		System.out.println("concurrent Hash Map content: "+cmap);
		
		//foreach(parallelThreshold,function)
		//running in parallel (parallel threshold is the number of elements required to run in parallel)
		cmap.forEach(3,(key,val)->{
			System.out.println("Thread is: "+Thread.currentThread().getName());
			System.out.println(key +" -- "+val);
		});
		
		//reduce(parallelthreshold,transformer-use arithmetic operations here,reducer-how to return the value transformed)
		System.out.println();
		String result=cmap.reduce(2,(k,v)->k+" - "+v.toUpperCase(),(r1,r2)->r1+", "+r2);
		System.out.println(result);
		System.out.println();
		
		//Simple reduce example
		int l=cmap.reduce(2,(k,v)->k.length(),Integer::max); //return max value of key length in the cmap
		System.out.println(l);
		
		
		//Search for a given country
		//search(pthreshold,function)
		String country="USA";
		String capital=cmap.search(3, (k,v)->{
			if(k.equals(country)) {
				return v;
			}else return null;
		});
		System.out.println();
		System.out.println(capital);
		
		
		
		
	}

}
