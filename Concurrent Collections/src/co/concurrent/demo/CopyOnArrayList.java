package co.concurrent.demo;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayList {
	
	public static void main(String[] args) {
		
		
		CopyOnWriteArrayList<Integer> numList= new CopyOnWriteArrayList<Integer>(new Integer[] {10,20,30,40,50});
		//this is a concurrent copy array list
		Iterator<Integer>it=numList.iterator();
		
		while(it.hasNext()) {
			int element=it.next();
			if(element==50) {
				numList.add(100);//no concurrentmodification exception is thrown (list methods are allowed unlike in traditional collections
			}
			//it.remove();// any iterator methods are not allowed like in traditional collections(will throw exception)
			
		}
		
		System.out.println(numList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
