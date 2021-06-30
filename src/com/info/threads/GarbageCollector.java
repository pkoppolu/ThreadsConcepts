package com.info.threads;
class Garbage{
	Garbage(){
		System.out.println("Object is created");
	}
	Garbage(int a){
		System.out.println("Object is created with parameter");
	}
}
public class GarbageCollector {
public static void main(String[] args) {
	Garbage g = new Garbage();
	g = null; // Assigning the reference value as NUll
	Garbage g2 = new Garbage(1);
	g = g2; // By assigning one reference to another reference or by Anonymous object
	System.gc();
}
}
