package com.part1;


import java.util.*;

import org.junit.Test;

public class OtherCollection {
	@Test
	public void HashtableTest(){
		Hashtable<Integer,String> hashtable=new Hashtable<Integer,String>();
		for(int i=9;i<49;i=i+3)hashtable.put(Integer.valueOf(i),new String(i+"--") );
		System.out.println(hashtable);
		Enumeration<String> e=hashtable.elements();
		Enumeration<Integer> k=hashtable.keys();
		while(e.hasMoreElements()){
//			String str=e.nextElement();
//			System.out.println(str);
					
		}
		
		
		
	}
}
