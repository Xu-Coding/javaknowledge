package com.part2;

public class ThreadDemo3 {

	/**
	 * ǰ̨�̣߳���̨�̣߳��ػ��̣߳�
	 * mainΪǰ̨�߳�
	 * @param args
	 */
	public static void main(String[] args) {
		Thread rose=new Thread(){
			public void run(){
              for(int i=0;i<10;i++){				
            	  System.out.println(Thread.currentThread()+"-"+this.isDaemon()+ "-rose��let me go!");
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
		//�����ػ��߳�
		jack.setDaemon(true);
		jack.start();
		
		System.out.println("main is ended");
	}
}
