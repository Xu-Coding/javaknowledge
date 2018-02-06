package com.part6;

import java.util.ArrayList;

public class GenericDemo1 {
	GenericTest<String>[] gTest1=(GenericTest<String>[])new GenericTest<?>[10];
//	ArrayList<String> a=new ArrayList<String>(); 
//	GenericTest<String>[] b=(Generic<String>[])a;

//	GenericTest<String>[] a=(GenericTest<String>[])new ArrayList<GenericTest<String>>();
	
}
class GenericTest<T>{
	T generic;
	public T genericTest(T arg){
		return arg;
	}
	
}