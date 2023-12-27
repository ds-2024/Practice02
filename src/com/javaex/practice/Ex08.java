package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//키 몸무게 입력받고
		//표준체중 계산후
		//저 표준 과 로 구분
		//출력
		// 표준체중 = (키 − 100) × 0.9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		
		int height = sc.nextInt();
		
		System.out.print("몸무게: ");
		
		int weight = sc.nextInt();
		
		if(weight > (height-100)*0.9) {
			System.out.println("과체중 입니다.");
			
			
			
			double standardWeight;
			standardWeight = (height -100)*0.9;
			System.out.println("표준체중: "+ standardWeight);
			
		}else if(weight == (height-100)*0.9) {
			System.out.println("표준 입니다.");
			
			double standardWeight;
			standardWeight = (height -100)*0.9;
			System.out.println("표준체중: "+ standardWeight);
			
		}else if(weight < (height-100)*0.9) {
			System.out.println("저체중 입니다.");
			
			double standardWeight;
			standardWeight = (height -100)*0.9;
			System.out.println("표준체중: "+ standardWeight);
			
			
			
			
		}
			
		
		
		sc.close();
	}

}
