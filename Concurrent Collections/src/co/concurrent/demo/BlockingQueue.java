package co.concurrent.demo;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {

	public static void main(String[] args) {
		
	
		java.util.concurrent.BlockingQueue<String> q= new ArrayBlockingQueue<String>(3);
		// Bounded blocking queue size is fixed cannot grow automatically
		//No sync or locking mechanism needed
		
		//Create producer and consumer
		
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);
		
		
		new Thread(producer).start();
		new Thread(consumer).start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
