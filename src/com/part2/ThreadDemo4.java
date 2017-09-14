package com.part2;

public class ThreadDemo4 {

	/**
	 * @param args
	 */
	 private static Object obj = new Object();

	    public static void main(String[] args){ 
	        ThreadA t1 = new ThreadA("t1"); 
	        ThreadA t2 = new ThreadA("t2"); 
	        t1.start(); 
	        t2.start();
	    } 

	    static class ThreadA extends Thread{
	        public ThreadA(String name){ 
	            super(name); 
	        } 
	        public void run(){ 
	            // ��ȡobj�����ͬ����
	            synchronized (obj) {
	                try {
	                    for(int i=0; i <10; i++){ 
	                        System.out.printf("%s: %d\n", this.getName(), i); 
	                        // i�ܱ�4����ʱ������100����
	                        if (i%4 == 100)
	                            Thread.sleep(1000);
	                    }
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        } 
	    } 

}
