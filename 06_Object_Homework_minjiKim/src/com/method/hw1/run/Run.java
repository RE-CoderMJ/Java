package com.method.hw1.run;

import com.method.hw1.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample ns = new NonStaticSample();
		
		System.out.print("1. ·£´ý °ª : ");
		ns.printLottoNumbers();
		
		ns.outputChar(5, 'a');
		
		System.out.println(ns.alphabette());
		
		System.out.println(ns.mySubstring("apple", 2, 4));
		
		
	}
}
