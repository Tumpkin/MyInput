package inputTest;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		// 3개의 정수를 한 번에 입력받은 후
		// 3개의 정수의 곱 출력
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0, secondNumber = 0, thirdNumber = 0, result = 0;
		String firstMsg = "정수 3개를 입력해주세요";
		System.out.println(firstMsg);
		firstNumber = Integer.parseInt(sc.next());
		secondNumber = Integer.parseInt(sc.next());
		thirdNumber = Integer.parseInt(sc.next());
		result = firstNumber * secondNumber * thirdNumber;
		System.out.printf("%d * %d * %d = %d", firstNumber, secondNumber, thirdNumber, result);
		
	}

}
