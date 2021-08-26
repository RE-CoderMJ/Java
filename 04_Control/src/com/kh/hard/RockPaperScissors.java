package com.kh.hard;

import java.util.Scanner;

public class RockPaperScissors {

	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("User name : ");
		String name = sc.nextLine();
		System.out.println();
		
		int totalNum = 0;
		int winNum= 0;
		int loseNum = 0;
		int drawNum = 0;

		String result = "";
		String win = "win!^__^";
		String lose = "loseT^T..";
		String draw = "===DRAW===";

		while (true) {
			System.out.print("Choose one (Rock/Scissors/Paper/exit(if you want to exit the game)) : ");
			String user = sc.nextLine();
			
			if(user.equals("Rock") || user.equals("Scissors") || user.equals("Paper")) {
				
				String computer = "";
				int compunum = (int) (Math.random() * 3);
				switch (compunum) {
				case 0: 
					computer = "Scissors";
					break;
				case 1:
					computer = "Rock";
					break;
				case 2:
					computer = "Paper";
					break;
				}
				
				if(computer.equals(user)) {
					result = draw;
					drawNum++;
				}else if(computer.equals("Rock")) {
					switch(user) {
					case "Scissors": result = lose; loseNum++; break;
					case "Paper" : result = win; winNum++; break;
					}
				}else if(computer.equals("Scissors")) {
					if(user.equals("Rock")) {
						result = win;
						winNum++;
					}else if(user.equals("Paper")) {
						result = lose;
						loseNum++;
					}
				}else { // Paper
					result = user.equals("Rock") ? lose : win;
					if (result == lose) {
						loseNum++;
					}else {
						winNum++;
					}
				}
				totalNum++;
				
				System.out.println();
				System.out.println("Computer : " + computer);
				System.out.println(name + " : " + user);
				System.out.println("Result : " + result);
				System.out.println();
				
			}else if(user.equals("exit") || user.equals("Exit")) {
				
				System.out.println();
				System.out.println("Computer VS " + name);
				System.out.println();
				System.out.println("total game : " + totalNum);
				System.out.println("win : " + winNum);
				System.out.println("lose : " + loseNum);
				System.out.println("draw : " + drawNum);
				System.out.println();
				if(loseNum < winNum) {
					System.out.println("CONGRATULATION!! YOU WIN!!!!!!!!!");
				}else if(loseNum > winNum){
					System.out.println("SORRY.... YOU LOSE.....PRACTICE MORE....T¤±T");
				}else {
					System.out.println("WOW! DRAW!");
				}
				break;
				
			}else {
				System.out.println("You put the wrong value. Please try it again.");
				continue;
			}
			
			
		}
	}
}
