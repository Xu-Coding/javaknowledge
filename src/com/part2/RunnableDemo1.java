package com.part2;

public class RunnableDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable rt=new RunnableTest();
		Thread th1=new Thread(rt,"A");
		th1.start();
		Thread th2=new Thread(rt,"B");
		th2.start();
	}

}


class RunnableTest implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
