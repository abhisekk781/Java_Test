package co.concurrent.demo;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {


	protected BlockingQueue<String> bq=null;
	
	
	
	public Consumer(BlockingQueue<String> bq) {
		this.bq = bq;
	}



	@Override
	public void run() {
     
		try {
			while(true) {
				System.out.println("Consuming : "+bq.take());//removes the first element from the head
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	
	
}
