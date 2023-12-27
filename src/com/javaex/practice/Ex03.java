package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// 오류 수정하기
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만이면
		//if (0< age <18) { <- 이런 수식 안됨.
		//System.out.println("청소년 입니다.");
		
		//age가 0살 초과이고 18살 미만이면
		if( age>0 && age<18 ) {
			System.out.println("청소년 입니다.");
		}
		

	}

}
