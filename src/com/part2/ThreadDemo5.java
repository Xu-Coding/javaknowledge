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
			System.out.println("down����ʼ����ͼƬ");
			for(int i=1;i<5;i++){
				System.out.println("down:%"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			}
			System.out.println("down������ͼƬ���");
			isFinish=true;
			/*
			 * ��ͼƬ������Ϻ󣬾Ϳ��Խ��show�߳̿�ʼ�����ˡ�
			 * 
			 * API�ĵ�����˵���������ǵ���ĳ�������wait����notify����ʱ���÷�����Ҫʹ��synchronized�����ͬ����
			 * �����������wait��notify�����Ķ��󣬷�����ʵ�����й����лᷢ���쳣��
			 */
			synchronized(obj){
			 obj.notify();
			}
			System.out.println("down:��ʼ���ظ���");
			for(int i=1;i<5;i++){
				System.out.println("down1:%"+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
			}
			System.out.println("down�����ظ������");
			isFinish=true;
			}
		};
		Thread show=new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ");
				try {
//					download.join();
					/*
					 * ��show�߳�ִ������仰�󣬾ͽ�������״̬�ˣ�ֱ��obj
					 * ��notify���������òŻ���������
					 */
					synchronized(obj){
					 obj.wait();
					}
				} catch (InterruptedException e) {
				}
				if(!isFinish){
					throw new RuntimeException("ͼƬ����ʧ��");
				}
				System.out.println("show:ͼƬ��ʾ�ɹ�");
			}
		};
		download.start();
		show.start();
	}

}
