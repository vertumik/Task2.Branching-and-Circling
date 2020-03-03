//26. Написать программу нахождения суммы большего и меньшего из трех чисел.

package by.htp.les03.main;

public class Main26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 8;
		int sum;
		int min;
		int max;
		min = a;
		max = a;
		if (b < min) {
			min = b;
		}
		if (b > max) {
			max = b;
		}
		if (c < min) {
			min = c;
		}
		if (c > max) {
			max = c;
		}
		sum = min + max;
		System.out.println("Сумма большего и меньшего из чисел = " + sum);
		
	}

}
