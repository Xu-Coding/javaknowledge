package com.part2;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("�˴�main�������߳��ǣ�"+t);
		dosome();
		//�Զ����߳�
		Thread myT=new Thread(){
			public void run(){
			   Thread t=Thread.currentThread();
			   System.out.println("�Զ����߳�Ϊ��"+t);
			   dosome();
			}
		};
		myT.start();
		
		
	}
	public static void dosome(){
		 //��ȡ����dosome�����ĵ�ǰ�߳�
		Thread t=Thread.currentThread();
		System.out.println("����dosome�������̵߳��߳��ǣ�"+t);
	}
	
}
