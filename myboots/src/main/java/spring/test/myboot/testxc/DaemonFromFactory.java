package spring.test.myboot.testxc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());

			
			for(int i = 0 ;i<10;i++) 
				exec.execute(new DaemonFromFactory());
			
			System.out.println("All daemo started");
			TimeUnit.MILLISECONDS.sleep(500);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println("当前线程名字为:"+Thread.currentThread()+""+this);	
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
	}

}
	}
