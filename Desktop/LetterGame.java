package task3;

import java.util.Scanner;

public class LetterGame {
	public static void main(String[] args){
		int answer = 59;
		int guess;
		int tries = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("������ �����Ͽ� ���ÿ� :");
			guess = sc.nextInt();
			tries++;
			
			if(guess > answer)
				System.out.println("������ ������ �����ϴ�.");
			if(guess < answer)
				System.out.println("������ ������ �����ϴ�.");
		}while (guess != answer);
		
		System.out.printf("�����մϴ�. �õ� Ƚ���� %d \n", tries);
	}

}
