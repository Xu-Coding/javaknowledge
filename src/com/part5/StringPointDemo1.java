package com.part5;

public class StringPointDemo1 {
	public static void main(String[] args) {
		String s1="Hello123";
		//��������ֵ�����ö���,���볣����
		String s2="Hello123";
		//new�����򲻻�����
		String s3=new String("Hello123");
		
		/**
		 * java��������һ���Ż���ʩ���������Ǽ�����ʽ��������߶�������������ô������
		 * ������class �ļ�ʱ�ͽ����������ϲ����浽������class�ļ��С�
		 * �������������class�ļ�����
		 * String s4="Hello123";
		 * 
		 */
		
		String s4="Hello"+"123";
		String s5="Hello";
		String s6=s5+"123";
	   
		String s7="Hello"+123;            //�˴�123�൱���ַ�����123��,s7="Hello123"
		
		String s8="He"+'l'+"lo"+123;
		
		String s9="123Hello";
		String s10=12+3+"Hello";         //�൱��15Hello
		                                   //int i='1';  //i=49
		String s11='1'+2+"3"+"Hello";     //s7="513Hello",'1'��ACCSIC��Ϊ49
	
		String s12='a'+26+"Hello";          //'a'��ACCISC��Ϊ97    
		
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
