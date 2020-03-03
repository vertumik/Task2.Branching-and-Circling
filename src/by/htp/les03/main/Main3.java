//3. Составить программу сравнения введенного числа а и цифры 3. 
//Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».

package by.htp.les03.main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		System.out.print("Введите число от 1 до 10: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int a = 3;
		if (number > a) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
	}

}
