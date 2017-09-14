package com.part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		ScheduledExecutorService ThPool=Executors.newScheduledThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Runnable runnable=new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Thread t=Thread.currentThread();
					System.out.println(t);
				}
			};
		}
	}

}
