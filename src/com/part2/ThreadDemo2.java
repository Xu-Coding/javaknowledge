package com.part2;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("运次main方法的线程是："+t);
		dosome();
		//自定义线程
		Thread myT=new Thread(){
			public void run(){
			   Thread t=Thread.currentThread();
			   System.out.println("自定义线程为："+t);
			   dosome();
			}
		};
		myT.start();
		
		
	}
	public static void dosome(){
		 //获取运行dosome方法的当前线程
		Thread t=Thread.currentThread();
		System.out.println("运行dosome方法的线程的线程是："+t);
	}
	
}
