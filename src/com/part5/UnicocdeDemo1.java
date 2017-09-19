package com.part5;

import java.io.UnsupportedEncodingException;

public class UnicocdeDemo1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="\u4f60\u597d";
		System.out.println(str);

		System.out.println("====================");
		
		String str0="\\u4f60\\u597d";
		System.out.println(str0);
		
		System.out.println("====================");
		
		String str1=UnicocdeDemo1.chinaToUnicode("ÄãºÃ");
		System.out.println(str1);
		
		System.out.println("====================");
		String str2="\\u";
		System.out.println(str2);
		
		System.out.println("====================");
		String str3="\\";
		System.out.println(str3);
		
	}
	/**
	 * string to unicode
	 * @param str
	 * @return
	 */
	public static String chinaToUnicode(String str){
		String result="";
		for (int i = 0; i < str.length(); i++) {
			int chr1=(char)str.charAt(i);
			if(chr1>=19968&&chr1<=171941){
				result+="\\u"+Integer.toHexString(chr1);
			}else{
				result+=str.charAt(i);
			}
		}
		return result;
	}
	
	/**
	 * judge whether it is chinese
	 * Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
	 * 
	 * @param c
	 * @return
	 */
	public static boolean isChinese(char c){
		Character.UnicodeBlock ub=Character.UnicodeBlock.of(c);
		if(ub==Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS){}
		return false;
	}
	
	
	
	
}
