package com.learning.threads;

public class MainThread implements Runnable {
	
		public static int count=0;
		    
		    public void run()
		    {
		        while(MainThread.count<=10)
		        {
		            try {
		                
		                System.out.println("My Thread "+ (++MainThread.count));
		                Thread.sleep(1000);
		                
		            } catch (Exception e) {
		                System.out.println("Error Occured "+e);
		            }
		        }
		    }
		    

	public static void main(String[] args) {
		MainThread mtd = new MainThread();
		Thread td = new Thread(mtd);
		td.start();
		
		while(MainThread.count<=10)
        {
            try {
                
                System.out.println("My Thread "+ (++MainThread.count));
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println("Error Occured "+e);
            }
        }
		System.out.println("Main thread is completed.");

	}

}
