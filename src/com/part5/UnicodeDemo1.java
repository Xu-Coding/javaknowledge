package com.part5;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class UnicodeDemo1 {
	@Test
	public  void unicodeTest() throws UnsupportedEncodingException {
		String str="\u6d4b\u8bd5";
		System.out.println(str);

		System.out.println("====================");
		
		String str0="\\u6d4b\\u8bd5";
		System.out.println(str0);
		
		System.out.println("====================");
		
		String str1=UnicodeCommonDemo1.chinaToUnicode("≤‚ ‘");
		System.out.println(str1);
		
		System.out.println("====================");
		String str2="\\u";
		System.out.println(str2);
		
		System.out.println("====================");
		String str3="\\";
		System.out.println(str3);
			
		System.out.println("====================");
		
		boolean b0=UnicodeCommonDemo1.isChinese(' ‘');
		System.out.println("str4 is chinese:"+b0);
		
	}
	@Test
	public void binaryTest(){
		int bin0=0x0016;
		System.out.println(bin0);
		System.out.println(Integer.toHexString(bin0));
		System.out.println(String.format("%03x", bin0));  //hexadecimal
		System.out.println("====================");
		
		int bin1=017;
		System.out.println(bin1);
		System.out.println(Integer.toOctalString(bin1));
		System.out.println(String.format("%09o", bin1)); //octal
		System.out.println("====================");
		
	
		
	}
	
	
}
