package com.part2;

import java.util.LinkedList;

public class ProductorConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basket basket=new Basket();
		Productor productor=new Productor(basket);
		Consumer consumer=new Consumer(basket);
		productor.start();
		consumer.start();
	}
	
	
}


class Consumer extends Thread{
	private Basket basket=null;

	public Consumer(Basket basket) {
		super();
		this.basket = basket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		basket.popApple();
	}
	
}

class Productor extends Thread{
	private Basket basket=null;

	public Productor(Basket basket) {
		super();
		this.basket = basket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		basket.pushApple();
	}
	
}

//篮子
class Basket{
	private LinkedList<Apple> basket=new LinkedList<Apple>();
	
	public synchronized void pushApple(){
		for(int i=0;i<20;i++){
			Apple apple=new Apple(i);
			push(apple);
		}
	}
	
	public synchronized void popApple(){
		for(int i=0;i<20;i++){
			pop();
		}
	}
		
	
	private void push(Apple apple){
		if(basket.size()==5){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		basket.addFirst(apple);
		System.out.println("存放："+apple.toString());
		notify();
	}
	private void pop(){
		if(basket.size()==0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Apple apple=basket.removeFirst();
		System.out.println("吃掉："+apple.toString());
		notify();
	}
}

// 苹果类
class Apple{
	private int id;
	public Apple(int id){
		this.id=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "苹果:"+(id+1);
	}
}