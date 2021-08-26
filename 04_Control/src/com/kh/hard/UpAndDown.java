package com.kh.hard;

import java.util.Scanner;

public class UpAndDown {

	public void method1() {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 100 + 1);

		int count = 0;

		while (true) {
			System.out.print("Guess the number between 1~100! : ");
			int num = sc.nextInt();
			if (num > 0 && num <= 100) {
				if (num != random) {
					if (num > random) {

						System.out.println("Down! Try it again:(");
					} else {
						System.out.println("Up! Try it again:(");
					}
					count++;
				} else {
					count++;
					System.out.println();
					System.out.println("******************************");
					System.out.println("Congrats!! You got the answer!");
					System.out.println("******************************");
					break;
				}
			} else {
				System.out.println("You put the wrong value please type in the number between 1~100");
			}
		}
		System.out.println();
		System.out.printf("You got the answer out of %d tries\n", count);
	}

}
