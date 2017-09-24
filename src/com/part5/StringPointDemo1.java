package com.part5;

public class StringPointDemo1 {
	public static void main(String[] args) {
		String s1="Hello123";
		//字面量赋值会重用对象,存入常量池
		String s2="Hello123";
		//new创建则不会重用
		String s3=new String("Hello123");
		
		/**
		 * java编译器有一个优化措施，就是若是计算表达式运算符两边都是字面量，那么编译器
		 * 就生成class 文件时就将结果计算完毕并保存到编译后的class文件中。
		 * 所以下面代码在class文件中是
		 * String s4="Hello123";
		 * 
		 */
		
		String s4="Hello"+"123";
		String s5="Hello";
		String s6=s5+"123";
	   
		String s7="Hello"+123;            //此处123相当于字符串“123”,s7="Hello123"
		
		String s8="He"+'l'+"lo"+123;
		
		String s9="123Hello";
		String s10=12+3+"Hello";         //相当于15Hello
		                                   //int i='1';  //i=49
		String s11='1'+2+"3"+"Hello";     //s7="513Hello",'1'的ACCSIC码为49
	
		String s12='a'+26+"Hello";          //'a'的ACCISC码为97    
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s3);          //false
		          //System.out.println(s1.equals(s3));        //true
		
		System.out.println(s1==s4);    //true
		System.out.println(s1==s6);    //false
		              //System.out.println(s1=s6);        //Hello123
		            //System.out.println(s1.equals(s6));    //true
		
		System.out.println(s1==s7);     //true

		System.out.println(s1==s8);    //true
		System.out.println(s9==s10);   //false
		System.out.println(s9==s11);  //false
		System.out.println(s9==s12);  //true
	}
}
