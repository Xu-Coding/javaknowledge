package com.part5;

public class StringPointDemo2 {
	public static void main(String[] args) {
		String str="thinking in java";
		StringBuilder builder=new StringBuilder(str);
		builder.append(",c");
		str=builder.toString();
//		System.out.println(builder);
		System.out.println(str);
		
		System.out.println("===");
		builder.replace(8,builder.length(),"-in-java");
		System.out.println(builder);
		
		System.out.println("===");
		builder.delete(0, 9);
		System.out.println(builder.toString());
		
		System.out.println("===");
		builder.insert(1, "ab");
		System.out.println(builder);
		
		System.out.println("===");
		builder.reverse();
		System.out.println(builder);
		
	}
}
