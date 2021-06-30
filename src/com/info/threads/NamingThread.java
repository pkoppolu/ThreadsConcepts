package com.info.threads;
public class NamingThread extends Thread {
	public void run(){  
		   System.out.println("Running...");  
		   System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());  
		  }  
	 public static void main(String args[]){  
		 NamingThread t1=new NamingThread();  
		 NamingThread t2=new NamingThread();  
		 System.out.println("Name of t1: "+t1.getName());  
		 System.out.println("Name of t2: "+t2.getName());    
		  t1.start();  
		  t2.start();  
		  t1.setPriority(Thread.MIN_PRIORITY);  
		  t2.setPriority(Thread.MAX_PRIORITY);  
		  t1.setName("Prudhvi");  
		  System.out.println("After changing name of t1:"+t1.getName());
		  System.gc(); // Example of daemon Thread
		 }  
}
