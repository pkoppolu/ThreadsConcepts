package com.info.threads;
class J1 implements Runnable{
	public void run() {
   try {
	   Thread.sleep(5000);
   }
   catch(InterruptedException ie) {
	   System.out.println("Exception Occured");
   }
   System.out.println("New thread terminating");
	}
}
public class JoiningThread {
public static void main(String[] args) throws InterruptedException {
	Thread t = new Thread();
	J1 j1 = new J1();
	j1.run();
	t.start();
	t.join(); // waits a thread to die and completes its task 
	System.out.println("Main thread terminating");
}
}
