package com.learning.threads;

public class ThreadClassDemo extends Thread {

	//implement run method
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+ " --> "+Thread.currentThread().getName());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	public static void main(String[] args) {
		
		ThreadClassDemo tcd1 = new ThreadClassDemo();
		ThreadClassDemo tcd2 = new ThreadClassDemo();
		
		tcd1.start();
		tcd2.start();

	}

}
