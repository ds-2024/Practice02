package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		
		int a = sc.nextInt();
		int re = a%3;
		
		
		switch(re) {
		
		case 0: 
			
			System.out.println("A팀입니다.");
			
			break;
			
		case 1:
			
			System.out.println("B팀입니다.");
			
			break;
			
		case 2:
			
			System.out.println("C팀입니다.");
			
			break;
		
		default : 
			
			System.out.println("잘못입력하셨습니다.");
				
		}
		
		sc.close();
	}

}
