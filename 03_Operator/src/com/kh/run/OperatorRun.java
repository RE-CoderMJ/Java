package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrement;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Ternary;

//import com.kh.operator.*; 패키지 안의 모든 클래스를 찾을 수 있도록! *은 모든을 의미
public class OperatorRun {

	public static void main(String[] args) {
		//System.out.println("잘실행되나?");
		
		A_LogicalNegation a = new A_LogicalNegation();
		
		//a.method1();
		
		B_InDecrement b = new B_InDecrement();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
		
		C_Arithmetic c = new C_Arithmetic();
		//c.method1();
		//c.quiz();
		
		D_Comparison d = new D_Comparison();
		//d.method1();
		//d.method2();
		
		E_Logical e = new E_Logical();
		//e.method1();
		//e.method2();
		//e.method3();
		//e.method4();
		//e.method5();
		
		F_Compound f = new F_Compound();
		//f.method1();
		
		G_Ternary g = new G_Ternary();
		//g.method1();
		//g.method2();
		//g.method3();
		//g.method4();
		//g.method5();
		g.method6();
	}
}
