package spring.test.myboot.testxc;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		
		Thread tt = new Thread(r);
		tt.setDaemon(true);		
		return tt;
	}

}
