package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//나이 입력받아서 19이상 65미만 ->"1번 그룹"
		// 그 이외에는 "2번그룹" 으로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		
		int age =  sc.nextInt(); // 비교) int age; age =  sc.nextInt();
		
		if(age>=19 && age<65) {
			System.out.println("1번그룹 입니다.");
			
		}else { 
			System.out.println("2번그룹 입니다.");
			
			sc.close();
		}

	}

}
