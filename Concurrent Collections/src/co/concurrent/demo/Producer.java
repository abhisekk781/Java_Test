package co.concurrent.demo;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    
	
	protected BlockingQueue<String> bq=null;
	
	
	
	public Producer(BlockingQueue<String> bq) {
		this.bq = bq;
	}


	@Override
	public void run() {
		try {
		
			for(int i=0;i<10;i++) {
			String data="10"+i;
			System.out.println("Producing : "+data);
				bq.put(data);
				Thread.sleep(1000);}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}


