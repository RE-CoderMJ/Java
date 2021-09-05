package com.kh.chap02_abstractAndInterface.part02_basic.run;

import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {
		
		Person mom = new Mother("김엄마", 50, 70, "출산");
		Person baby = new Baby("강아기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(baby);
		
		mom.eat(); // 몸무게 +10 건강도 -10
		baby.eat(); // 몸뭄게 +3 건강도 +1
		
		mom.sleep(); // 건강도+20
		baby.sleep(); // 건강도+3
		//((Baby)(baby)).sayHi();
		
		System.out.println("====== 다음날 ======");
		System.out.println(mom);
		System.out.println(baby);
		
		System.out.println();
		//Basic b = new Basic(); // 레퍼런스 변수로는 사용 가능하나 객체 생성은 불가함!!
		
		Basic mom2 = new Mother("김엄마", 50, 70, "출산");
		Basic baby2 = new Baby("강아기", 3.5, 70);
		
		System.out.println(mom2);
		System.out.println(baby2);
		
		mom2.eat();
		baby2.eat();
		mom2.sleep();
		baby2.sleep();
		//baby2.sayHi();
		//Basic 인터페이스에 정의된 메소드만 사용 가능.
		
		System.out.println(mom2);
		System.out.println(baby2);

		/*
		 * 클래스에서 클래스를 상속받을때 : 클래스 extends 클래스 (단일상속만 가능) 					   : 화살표 "실선"
		 * 클래스에서 인터페이스를 구현할때 : 클래스 implements 인터페이스, 인터페이스, ..(다중상속 가능) : 화살표 "점선"
		 * 인터페이스에서 인터페이스 상속    : 인터페이스  extends 인터페이스, 인터페이스, ..(다중상속 가능) : 화살표 "실선"
		 * 
		 * 
		 * 		       ㅣ	             추상클래스			ㅣ			인터페이스
		 * ====================================================================
		 * 상속갯수     ㅣ			단일상속			ㅣ			다중상속
		 * ---------------------------------------------------------------------
		 * 키워드	       ㅣ       		extends			ㅣ		  implements
		 * ---------------------------------------------------------------------
		 * 추상메소드  ㅣ      	추상메소드 0개 이상		ㅣ		모든 메소드가 추상메소드
		 * 표현법/갯수ㅣ	명시적으로 abstract 기술	ㅣ	묵시적으로 abstract (생략가능)
		 * ---------------------------------------------------------------------
		 * 일반메소드여부 ㅣ 		  O				ㅣ				X
		 * ---------------------------------------------------------------------
		 * 필드		ㅣ		일반필드 가질 수 있음		ㅣ	상수필드만 가질 수 있음(묵시적으로 public static final)
		 * ---------------------------------------------------------------------
		 * 
		 * 
		 * extends 일반클래스	-->	extends 추상클래스	--> implements 인터페이스
		 * ------------------------------------------------------------>
		 * 					  강제성이 더 짙어짐(규약이 더 쎄짐)
		 * 
		 * 
		 */
	}

}
