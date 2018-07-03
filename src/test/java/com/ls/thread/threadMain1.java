package com.ls.thread;

public class threadMain1 {

	public static void main(String[] args) {
		threadTest1 t1=new threadTest1();
		threadTest2 t2=new threadTest2();
		System.out.println("begin start");
//		t1.start();
		t1.start();
		t2.start();
		System.out.println("after start");
		
	}
}
