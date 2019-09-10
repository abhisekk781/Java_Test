package co.concurrent.demo2;

import java.util.concurrent.atomic.AtomicInteger;

public class CountingThread extends Thread {
	
	
	//private int count;
	AtomicInteger count=new AtomicInteger();
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//count++;
			count.incrementAndGet();//same as count++
		}
	}


	public int getCount() {
		return this.count.get();
	}


	

}
