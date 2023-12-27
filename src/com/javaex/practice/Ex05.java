package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int age; //나이
		
		Scanner sc = new Scanner(System.in);
		
		//나이를 입력받는다.
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age =  sc.nextInt();
		
		//그룹을 분류한다.
		if(age > 20) {// 20살 초과이면
			System.out.println("\"1번그룹\""); // escape sequence 는 문자열 안에서 특별한 의미로 해석.
			// \n 개행 \t 탭 \" 큰 따옴표 \역슬래쉬
		}else { //20살 이하이면
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
		
		sc.close();
		}

	}

/*(1)15일 때 결과 -> '2번그룹'
 * (2)19일 때 결과 -> '2번그룹'
 * (3)20일 때 결과 -> '2번그룹'
 * (4)21일 때 결과 -> "1번그룹"
 * (5)100일 때 결과 -> "1번그룹"
 */






