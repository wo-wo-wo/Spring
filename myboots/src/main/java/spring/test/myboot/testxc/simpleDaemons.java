package spring.test.myboot.testxc;

import java.util.concurrent.TimeUnit;

public class simpleDaemons implements Runnable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		for(int i = 0 ;i< 10 ; i++) {
			
			Thread t =  new Thread(new simpleDaemons());

			t.setDaemon(true);
			t.start();			
			
		}
		
		System.out.println("All");
		TimeUnit.MILLISECONDS.sleep(5000);

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
