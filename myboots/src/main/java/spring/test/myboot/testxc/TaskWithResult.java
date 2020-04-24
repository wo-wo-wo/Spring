package spring.test.myboot.testxc;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskWithResult implements Callable<String> {
	
	private int id;
	
	TaskWithResult (int id){
		this.id = id;
	}
	


	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		
		
		return "result of taskWithResult "+id;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> result = new ArrayList<>();
		
		for(int i = 0 ;i < 10 ;i++) {
			result.add(exec.submit(new TaskWithResult(i)));
						
		}
		
		for(Future<String> S:result) {
			try {
				
			System.out.println(S.isDone());
				
				System.out.println(S.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				exec.shutdown();
			}
						
		}
			

	}

}
