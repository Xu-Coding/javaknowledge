package com.part2;

public class ThreadDemo5 {

	/**
	 * @param args
	 */
	private static boolean isFinish=false;
	 private static Object obj=new Object();
	public static void main(String[] args) {  
		final Thread download=new Thread(){
			public void run(){
			System.out.println("down：开始下载图片");
			for(int i=1;i<5;i++){
				System.out.println("down:%"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			}
			System.out.println("down：下载图片完毕");
			isFinish=true;
			/*
			 * 当图片下载完毕后，就可以解除show线程开始工作了。
			 * 
			 * API文档上有说明：当我们调用某个对象的wait或者notify方法时，该方法需要使用synchronized块进行同步。
			 * 而锁对象就是wait与notify所属的对象，否则在实际运行过程中会发生异常。
			 */
			synchronized(obj){
			 obj.notify();
			}
			System.out.println("down:开始下载附件");
			for(int i=1;i<5;i++){
				System.out.println("down1:%"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			}
			System.out.println("down：下载附件完毕");
			isFinish=true;
			}
		};
		Thread show=new Thread(){
			public void run(){
				System.out.println("show:开始显示图片");
				try {
//					download.join();
					/*
					 * 当show线程执行完这句话后，就进入阻塞状态了，直到obj
					 * 的notify方法被调用才会解除阻塞。
					 */
					synchronized(obj){
					 obj.wait();
					}
				} catch (InterruptedException e) {
				}
				if(!isFinish){
					throw new RuntimeException("图片加载失败");
				}
				System.out.println("show:图片显示成功");
			}
		};
		download.start();
		show.start();
	}

}
