package com.part2;

public class ThreadDemo3 {

	/**
	 * 前台线程，后台线程（守护线程）
	 * main为前台线程
	 * @param args
	 */
	public static void main(String[] args) {
		Thread rose=new Thread(){
			public void run(){
              for(int i=0;i<10;i++){				
            	  System.out.println(Thread.currentThread()+"-"+this.isDaemon()+ "-rose：let me go!");
                  try {
					   Thread.sleep(1000);
				   }catch (InterruptedException e) {
					   e.printStackTrace();
				   }
              }
              System.out.println("rose:AAAA");
              System.out.println("rose:BBBB");
			}
		};
		
		
		
		Thread jack=new Thread(){
			public void run(){
			  while(true){
				 System.out.println(Thread.currentThread()+"-"+this.isDaemon()+ "-jack:you jump!i jump!");
			     try {
					 Thread.sleep(1000);
				  } catch (InterruptedException e) {
					  e.printStackTrace();
				 }
			  }
			}
		};
		rose.setDaemon(true);
		rose.start();
		//设置守护线程
		jack.setDaemon(true);
		jack.start();
		
		System.out.println("main is ended");
	}
}
