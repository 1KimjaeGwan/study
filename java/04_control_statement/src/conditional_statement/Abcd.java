package conditional_statement;

import java.util.Scanner;

public class Abcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력하시오.");
		int a = sc.nextInt();
		System.out.println("성적을 입력하시오.");
		int b = sc.nextInt();
		System.out.println("성적을 입력하시오.");
		int c = sc.nextInt();
		System.out.println("성적을 입력하시오.");
		int d = sc.nextInt();
		System.out.println("성적을 입력하시오.");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		System.out.println("평균 성적은"+sum/5+"입니다");
		
	}

}
