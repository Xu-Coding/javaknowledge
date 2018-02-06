package com.part2;


//volatile
public class ThreadDemo6 {
	public volatile int inc=0;
	public void increase(){
		inc++;
	}
	public static void main(String[] args) {
		final ThreadDemo6 td6=new ThreadDemo6();
		for(int i=0;i<10;i++){
			new Thread(){
				public void run(){
					for (int j = 0; j < 1000; j++) {
						td6.increase();
					}
				}
			}.start();
		}
		while(Thread.activeCount()>1)
			Thread.yield();
		System.out.println(td6.inc);
	}
}
