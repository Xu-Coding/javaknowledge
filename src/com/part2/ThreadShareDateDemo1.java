package com.part2;

public class ThreadShareDateDemo1 {
	public static void main(String[] arg){
//		TicketThread s1=new TicketThread("first window");
//		s1.start();
//		TicketThread s2=new TicketThread("Second window");
//		s2.start();
		
		TicketRunnable runnable=new TicketRunnable();
		Thread t1=new Thread(runnable,"first window");
		t1.start();
		Thread t2=new Thread(runnable,"second widows");
//		t1.start();
		t2.start();
		
		
	}
}

class TicketThread extends Thread{
	private int ticket=5;
	public TicketThread(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(this.getName()+":"+(ticket--));
			if(ticket<1){
				break;
			}
		}
	}
}

class TicketRunnable implements Runnable{
	private int ticket=5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(Thread.currentThread().getName()+":"+(ticket--));
			if(ticket<1){
				break;
			}
		}
	}
	
}


