package com.part1;

import java.util.*;
import static java.lang.System.*;

import org.junit.Test;

public class CollectionDemo1 {
	@Test   //to test the binary search
	public void binarySearchTest(){
		List<Integer> intList=new LinkedList<Integer>();
		for(int i=9;i<49;i=i+3)intList.add(i);
		out.println("sort data:"+intList);
//		Collections.shuffle(intList);
		out.println("shuffle data:"+intList);
		int index=Collections.binarySearch(intList,Integer.valueOf(11),new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		});
		out.println("binary search data index:"+index);
		if(index<0) intList.add(-index-1,Integer.valueOf(11));
		out.println("after add data:"+intList);
	}
	
	@Test
	public void otherTest(){
		Integer i=Integer.valueOf(9);
		Integer _i=Integer.valueOf(8);
		out.println(i-_i);
		out.println(i.getClass());
		
		
	}
	
}
