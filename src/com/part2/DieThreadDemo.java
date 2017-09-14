package com.part2;

public class DieThreadDemo {
	public static void main(String[] arg){
		Example ex=new Example();
		DieThread1 d1=new DieThread1(ex);
		d1.start();
		DieThread2 d2=new DieThread2(ex);
		d2.start();
	}
}

class DieThread1 extends Thread{
	private Example example=null;
	public DieThread1(Example example){
		super();
		this.example=example;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		example.method1();
	}
}

class DieThread2 extends Thread{
	private Example example=null;
	public DieThread2(Example example){
		super();
		this.example=example;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		example.method2();
	}
}

class Example{
	private Object obj1=new Object();
	private Object obj2=new Object();
	
	public void method1(){
		synchronized (obj1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (obj2) {
				System.out.println("method1");
			}
		}
	}
	
	
	public void method2(){
		synchronized (obj2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (obj1) {
				System.out.println("method2");
			}
		}
	}

}