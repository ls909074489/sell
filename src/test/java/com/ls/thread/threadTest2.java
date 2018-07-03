package com.ls.thread;

public class threadTest2 extends Thread {

	@Override
	public synchronized void start() {
		System.out.println("threadTest2 start===========");
		for (int i = 0; i < 100; i++) {
			System.out.println("进入start运行状态==========" + i);
		}
		super.start();
	}

	@Override
	public void run() {
		System.out.println("run===========");
		for (int i = 0; i < 100; i++) {
			System.out.println("threadTest2 进入run运行状态==========" + i);
		}
		super.run();
	}

	@Override
	public void destroy() {
		System.out.println("threadTest2 destory===========");
		super.destroy();
	}

}
