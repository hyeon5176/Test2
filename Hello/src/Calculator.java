import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			int num1;
			int num2;
			int result = 0;
			System.out.printf("첫번째 숫자를 입력하세요. : ");
			num1 = scan.nextInt();
			System.out.printf("두번째 숫자를 입력하세요. : ");
			num2 = scan.nextInt();
			System.out.printf("사칙연산기호를 입력하세요. 종료하려면 0을 입력하세요. : ");
			char oper = scan.next().charAt(0);

			switch (oper) {
				case '0':
					exit = true;
					System.out.println("종료되었습니다.");
					break;
				case '+':
					result = num1 + num2;
					System.out.println("결과값 : " + result);
					break;
				case '-':
					result = num1 - num2;
					System.out.println("결과값 : " + result);
					break;
				case '*':
					result = num1 * num2;
					System.out.println("결과값 : " + result);
					break;
				case '/':
					if (num2 != 0) {
						result = num1 / num2;
						System.out.println("결과값 : " + result);
						break;
					} else {
						System.out.println("0으로는 나눌 수 없습니다.");
						return;
					}
			}
		}
		scan.close();
		
	}
}