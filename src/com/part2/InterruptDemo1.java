package com.part2;

public class InterruptDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		Thread t1=new Thread(new Runnable(){
			private int demoData=5;
			@Override
			public void run() {
				try{
					while(true){
						System.out.println(Thread.currentThread().getName()+":"+(demoData--));
						Thread.currentThread().interrupt();  
						Thread.sleep(1000);
//						Thread.currentThread().interrupt();
//						boolean b1=Thread.interrupted();
//						boolean b2=Thread.interrupted();
//						System.out.println(b1+","+b2);
						if(demoData<1){
							break;
						}
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		},"A");
		t1.start();

	}
}
