package co.concurrent.demo2;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicOperationsDemo {
	public static void main(String[] args) throws InterruptedException {
		
		CountingThread ct= new CountingThread();
		
		Thread t1= new Thread(ct, "Thread-1");
		Thread t2= new Thread(ct, "Thread-2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Count : "+ct.getCount());//this will get different values everytime
		
		//either use sync in run method block or use atomic count
		
		
		//Demo
		
		AtomicInteger ai= new AtomicInteger(9);
		System.out.println("ai value after increment is: "+ai.incrementAndGet());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
