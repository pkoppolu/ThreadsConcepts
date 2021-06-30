package com.info.threads;
// Implementing Runnable Interface
public class LifeCycle implements Runnable{ // Created a thread by implementing Runnable Interface
	public void run() {
		System.out.println("Main thread is running");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(); // Creating a thread object
        t1.start();
        try {
            t1.sleep(1000); // Calling Sleep Method for 1 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setPriority(1); //Setting a priority
        int p1 = t1.getPriority(); // get priority
        System.out.println(p1);
        System.out.println("Thread Running");
	}
}
