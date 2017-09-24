package com.part5;

import org.junit.Test;
//import static java.lang.System.*;

public class StringMethodDemo1 {
	
	@Test
	public void methodTest(){
		String str="www.oracle.com";
		String sub=str.substring(4,10);  //范围在大于0小于数组length
		System.out.println(sub);
		/**
		 * 重载方法。只需要传入一个参数，从给定的位置开始连续截取到字符串末尾
		 */
		 sub=str.substring(4);
		System.out.println(sub);
	}
	
	@Test
	public void methodTest1(){
		/*
		 * indexof
		 */
		String str="thinking in java";
		int index=str.indexOf("java");
//		out.println(index);
		System.out.println(index);
		System.out.println("====");
		index=str.indexOf("in",3);
		System.out.println(index);
		System.out.println("====");
		index=str.indexOf("in",2);
		System.out.println(index);
		System.out.println("====");
		int last=str.lastIndexOf("in");
		System.out.println(last);
	}
	
	@Test
	public void methodTest2(){
		/*
		 * length:the spaces is one character length
		 */
		String str="thinking in java";
		System.out.println(str.length());//spaces is one character length
	}
	@Test
	public void methodTest3(){
		/*
		 * String.valueof:a static method
		 */
		String istr=String.valueOf(123);
		System.out.println(istr);
		String dstr=String.valueOf(123.123);
		System.out.println(dstr+'4');
		String str=123+"";
		System.out.println(str);
		boolean boo=true;
		System.out.println(String.valueOf(boo));
		char[] ch={'s','d','g'};
		System.out.println(String.valueOf(ch));
	} 
	
	@Test
	public void methdTest4(){
		String str="a";
		for (int i = 0; i < 100; i++) {
			str+="a";
		}
		System.out.println(str);
	}

}
