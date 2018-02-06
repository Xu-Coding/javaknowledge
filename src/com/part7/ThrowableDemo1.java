package com.part7;

public class ThrowableDemo1 {
	public static void main(String[] args) {
		int a=ThrowableDemo1.f(2);
		System.out.println(a);
	}
	
	public static int f(int n){
		try {
			int r=n*n;
			return r;
		} finally{
			if(n==2){
				return 0;
			}
		}
	}
}
