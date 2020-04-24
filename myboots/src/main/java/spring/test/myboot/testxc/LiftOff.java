package spring.test.myboot.testxc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
	
	protected int countDown = 10;
	private static int taskCount = 0;
	private final  int id =taskCount++;
	
	
	LiftOff(){};
	LiftOff(int countDown){
		
		this.countDown = countDown;
	};
	
	
	public String status() {
	//	System.out.println(":"+id+":");
		
		return "#"+id+"("+(countDown > 0 ? countDown : "LiftOff")+"),"; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //    new LiftOff().run();
//		for(int i = 0 ; i< 5 ;i++) {
//			Thread tt = new Thread(new LiftOff());
//			tt.start();			
//		}
		
		
//		for(int i = 0; i<5 ; i++) {
//			ExecutorService  ex = Executors.newCachedThreadPool() ;
//			ex.execute(new LiftOff());
//			ex.shutdown();			
//		} 
//		
		
//		
//		for(int i = 0; i<5 ; i++) {
//			ExecutorService  ex = Executors.newFixedThreadPool(5) ;
//			ex.execute(new LiftOff());
//			ex.shutdown();
//			
//		} 
		
		
		for(int i = 0; i<5 ; i++) {
			ExecutorService  ex = Executors.newSingleThreadExecutor();
			ex.execute(new LiftOff());
			ex.shutdown();
			
		} 
		System.out.println("当前线程"+Thread.currentThread());
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
		System.out.print("\n");
	}

}
