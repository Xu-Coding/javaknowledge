package com.part2;

public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		BankThread p1=new BankThread(bank);
		p1.start();
		BankThread p2=new BankThread(bank);
		p2.start();
	}
	
}
class BankThread extends Thread{
	private Bank bank=null;
	public BankThread(Bank bank){
		this.bank=bank;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("取钱："+bank.getMoney(400));
	}
}
class Bank{
	private int money=500;
	private Object obj=new Object();
	//取钱方法
	public  int getMoney(int number){
		synchronized(obj){
			if(number<0){
				return -1;
			}else if(money<0){
				return -2;
			}else if(number-money>0){
				return -3;
			}else{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				money-=number;
				System.out.println("余额："+money);
			}
			return number;
		}
	}
}
