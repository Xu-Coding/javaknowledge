package com.part2;

public class PropertyThreadDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread max=new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("max");
				}
			}		  
		};
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					Thread.yield();
					System.out.println("min");
				}
			}		  
		};
		
		Thread norm=new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("norm");
				}
			}		  
		};
//		max.setPriority(Thread.MAX_PRIORITY);
//		min.setPriority(Thread.MIN_PRIORITY);
		min.start();
		max.start();
		norm.start();
		
	}

}
