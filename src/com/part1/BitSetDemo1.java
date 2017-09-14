package com.part1;

import java.util.BitSet;

import org.junit.Test;

public class BitSetDemo1 {
	@Test
	public void bitSetTest(){
		int n=2000000;
		long start=System.currentTimeMillis();
		BitSet b=new BitSet(n+1);
		int count=0;
		int i;
		for(i=2;i<=n;i++) b.set(i);
		i=2;
		while(i*i<=n){
			if(b.get(i)){
				count++;
				int k=2*i;
				while(k<=n){
					b.clear(k);
					k+=i;
				}
			}
		}
	}
}
