package com.part2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableDemo1 implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int i=0;
		for (;  i< 60; i++) {
			System.out.println(Thread.currentThread().getName()+"i��ֵ�ǣ�"+i);
		}
		// TODO Auto-generated method stub
		return i;
	}
	
	public static void main(String[] args) {
		ThreadCallableDemo1 tcd=new ThreadCallableDemo1();
		FutureTask<Integer> task=new FutureTask<Integer>(tcd);
		for (int i = 0; i < 60; i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
			if(i==10){
				new Thread(task,"�з���ֵ���߳�").start();
			}
		}
		try {
			System.out.println("���̷߳���ֵ��"+task.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
