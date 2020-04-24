package spring.test.myboot.testxc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable{
	
	private int countDown = 5 ;
	
	private volatile double d;
	
	private int priorities;
	
	SimplePriorities(int priorities){
		this.priorities = priorities;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService ee = Executors.newCachedThreadPool();
		
		for(int i = 0 ; i< 5; i++) 
		
			
			ee.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		  ee.execute(new SimplePriorities(Thread.MAX_PRIORITY));
			ee.shutdown();
		
		
		
	}
	
	

	@Override
	public String toString() {
		return Thread.currentThread() +": "+countDown;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setPriority(priorities);
		while(true) {
			for(int i = 1 ; i < 100000 ; i ++ ) {
				 d += (Math.PI+Math.E)/(double)i;
				 
				 if(i % 1000 == 0) 
					 Thread.yield();
				 
				 System.out.println(this);
				 
				 if(-- countDown == 0) return;
					 
				
				 
				 
			}
			
			
			
		}
		
		
		
	}

}
