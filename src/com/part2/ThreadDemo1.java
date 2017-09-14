package com.part2;

public class ThreadDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadTest Th1=new ThreadTest("A");
//		Th1.setName("A");
		Th1.start();
		ThreadTest Th2=new ThreadTest("B");
//		Th2.setName("B");
		Th2.start();
	}
}

class ThreadTest extends Thread{
	public ThreadTest(String name){
		super(name);   //use the constructor of super 
	}
	@Override
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(this.getName()+":"+i);
		}
	}
}

