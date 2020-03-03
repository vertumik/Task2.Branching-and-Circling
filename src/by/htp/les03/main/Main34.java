/*
 * 34. Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
 * Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, 
 * печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
 * то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
 * то печатает сообщение об этом и указывает размер недостающей суммы.
 */

package by.htp.les03.main;

import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		
		System.out.println("Введите стоимость книг: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int totBook = scan.nextInt();
		System.out.println("Введите  полученную сумму: ");
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner (System.in);
		int sum = scan2.nextInt();
		if (totBook == sum) {
			System.out.println("Спасибо за покупку!");
		}else if (totBook < sum) {
			double change = sum - totBook;
			System.out.println("Возьмите сдачу " + change);
		}else {
			System.out.println("Недостаточно денег для покупки!");
		}
		

	}

}
