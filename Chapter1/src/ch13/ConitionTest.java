package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("두 수를 입력받아 더 큰 수를 출력해라\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1:");
		int num1 = sc.nextInt();
		System.out.println("입력 2:");
		int num2 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
		
	}

}
