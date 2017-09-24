package com.part5;

public class IntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Integet to int:intValue
		 */
		Double d=new Double(1.2);
		double d0=d.doubleValue();
		double d1=d.intValue();
		int i0=d.intValue();
		
		System.out.println(d0);
		System.out.println(d1);
		System.out.println(i0);
		System.out.println("====");

		/*
		 * int to Integet:Integet.valueOf
		 */
		Integer i1=Integer.valueOf(1);
		Integer i2=Integer.valueOf(1);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println("====");
		Integer i3=new Integer(1);
		Integer i4=new Integer(1);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		/*
		 * string to basic type by Integer.pareInt
		 */
		System.out.println("===");
		String istr="123";
		int i=Integer.parseInt(istr);
		System.out.println(i);
		String bstr="true";
		boolean boo=Boolean.parseBoolean(bstr);
		System.out.println(boo);
		
		
		
	}

}
