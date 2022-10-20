package com.Task;

public class Memory {

	public static void main(String[] args) throws InterruptedException {
		
		StringBuilder n= new StringBuilder ("JAVA");
		System.out.println(System.identityHashCode(n));
		Thread.sleep(5000);
		
		StringBuilder n1= new StringBuilder ("Class");
		System.out.println(System.identityHashCode(n1));
		
		System.out.println(System.identityHashCode(n.append(n1)));
	
		
	}
}
