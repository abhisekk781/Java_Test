package co.concurrent.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueDemo2 {
	public static void main(String[] args) {
		
		java.util.concurrent.BlockingQueue<String> bq= new ArrayBlockingQueue<String>(3);//capacity 3
		
		bq.add("Japan");
		bq.add("India");
		bq.add("Russia");
		
		System.out.println(bq);
		
		//bq.add("Germany");// will throw exception because size is full
		
		List<String>list= new ArrayList<String>();
		
		
		int status =bq.drainTo(list); //removes all elements from blocking queue and puts it into the arraylist
		
		System.out.println(status+" - "+list);
		System.out.println("Queue : "+bq);
		
		
		
	}

}
