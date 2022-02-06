package com.learning.threads;

public class ThreadDemoRunnable implements Runnable {
	
		//implement run method
		    public void run()
		    {
		        for(int i=1;i<=5;i++)
		        {
		            System.out.println(i+ " "+Thread.currentThread().getName());
		            
		            try {
		                Thread.sleep(1000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }

	public static void main(String[] args) {
		
		ThreadDemoRunnable tdr1 = new ThreadDemoRunnable();
		ThreadDemoRunnable tdr2 = new ThreadDemoRunnable();
		
		Thread t1 = new Thread(tdr1);
		Thread t2 = new Thread(tdr2);
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
		t1.start();
		t2.start();

	}

}
