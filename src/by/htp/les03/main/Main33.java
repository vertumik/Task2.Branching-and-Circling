/*
 * 33. Написать программу, которая по паролю будет определять уровень доступа сотрудника 
 * к секретной информации в базе данных. Доступ к базе имеют только шесть человек, 
 * разбитых на три группы по степени доступа. Они имеют следующие пароли: 9583, 1747 — доступны 
 * модули баз А, В, С; 3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.
 */

package by.htp.les03.main;

import java.util.Scanner;

public class Main33 {

	public static void main(String[] args) {
		
		System.out.println("Введите пароль: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		int pas = sc.nextInt();
		if (pas == 9583 || pas == 1747) {
			System.out.println("Доступны модули баз А, В, С");
		}else if (pas == 3331 || pas == 7922) {
			System.out.println("Доступны модули баз В, С");
		}else if (pas == 9455 || pas == 8997) {
			System.out.println("Доступны модули баз С");
		}else {
			System.out.println("Модули баз не доступны");
		}

	}

}
