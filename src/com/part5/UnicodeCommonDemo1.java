package com.part5;

public class UnicodeCommonDemo1 {

	/**
	 * string to unicode
	 * \\u
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
		 if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				    || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				    || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				    || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
				    || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				    || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
		   return true;
		  }
		return false;
	}
	
	
	
	
}
