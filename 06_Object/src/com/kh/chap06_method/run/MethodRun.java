package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.StaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;

import java.util.Scanner;

public class MethodRun {

	public static void main(String[] args) {
		
		/*
		// ----- NonStaticMethod -----
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. 古鯵痕呪 蒸壱 鋼発葵亀 蒸澗 五社球 硲窒
		test.method1();
		
		//2. 古鯵痕呪 蒸壱 鋼発葵精 赤澗 五社球 硲窒
		//String str = test.method2();
		//System.out.println(str);
		System.out.println(test.method2());
		
		// 3. 古鯵痕呪 赤壱 鋼発葵精 蒸澗 五社球 硲窒
		test.method3(10, 20);
		
		// 4. 古鯵痕呪亀 赤壱 鋼発葵亀 赤澗 五社球 硲窒
		//char ch = test.method4("pineapple", 3);
		//System.out.println(ch);
		//System.out.println(test.method4("pineapple", 3));
		Scanner sc = new Scanner(System.in);
		System.out.print("庚切伸 脊径 : ");
		String str = sc.nextLine();
		
		System.out.print("舛呪 脊径 : ");
		int num = sc.nextInt();
		
		System.out.println("衣引 : " + test.method4(str, num));
	}
	*/
	
		// ----- StaticMethod -----
		StaticMethod.method1();
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("沿肯走");
		System.out.println(StaticMethod.method4("apple", "kiwi"));
	
		
		// ----- OverloadingTest -----
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(20);
		ot.test(10, "ぞぞぞ");
		ot.test("せせせ", 20);
		ot.test(50, 60);
		ot.test("沿肯走");
		
		System.out.println(10);
		System.out.println("いい");
		System.out.println(0.0);
		
		
	}
	
	
}
