package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int no2 = sc.nextInt();
		
		if(no1>=no2) {
			
			int por = no1/no2;
			int re = no1%no2;
			System.out.println("몫: " + por);
			System.out.println("나머지: " + re);
			
		}else {
			
			int por2 = no2/no1;
			int re2 = no2%no1;
			System.out.println("몫: " + por2);
			System.out.println("나머지: " + re2);
			
			
			
		}
		
		
		sc.close();
		
		

	}

}
