package com.ls.thread;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		Runner1 runner1 = new Runner1(map);
		Runner2 runner2 = new Runner2(map);
		// Thread(Runnable target) 分配新的 Thread 对象。
		Thread thread1 = new Thread(runner1);
		Thread thread2 = new Thread(runner2);
		thread1.start();
		thread2.start();
		// thread1.run();
		// thread2.run();

	}

}

class Runner1 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
	Map<String, String> map = new HashMap<String, String>();

	public Runner1() {
	}

	public Runner1(Map<String, String> map) {
		this.map = map;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("进入Runner1运行状态——————————" + i);
			map.put(i + "", i + "");
		}
		System.out.println("进入Runner1运行状态 map size:" + map.size());
	}
}

class Runner2 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
	Map<String, String> map = new HashMap<String, String>();

	public Runner2() {
	}

	public Runner2(Map<String, String> map) {
		this.map = map;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("进入Runner2运行状态——————————" + i);
			map.put(i + "", i + "");
		}
		System.out.println("进入Runner2运行状态 map size:" + map.size());
	}
}