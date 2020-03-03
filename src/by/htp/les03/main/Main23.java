//23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
//Если введены некорректные данные, то сообщить об этом.

package by.htp.les03.main;

import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		System.out.println("Введите дату от 1 до 31: ");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner (System.in);
			int d = sc.nextInt();
			if (d < 1 || d > 31) {
				System.out.println("Вы ввели некорректные данные");
			}else {
				System.out.println("День недели равен " + d);
			}
		System.out.println("Введите месяц от 1 до 12: ");
			@SuppressWarnings("resource")
			Scanner sc2 = new Scanner (System.in);
			int m = sc2.nextInt();
			
			if (m < 1 || m > 12) {
				System.out.println("Вы ввели некорректные данные");
			}else {
				System.out.println("Месяц равен " + m);
			}
	}

}
