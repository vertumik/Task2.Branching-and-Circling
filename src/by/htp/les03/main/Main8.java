//8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.

package by.htp.les03.main;

public class Main8 {

	public static void main(String[] args) {
		double a;
		double b;
		a = 2;
		b = 4;
		a = Math.pow(a, 10);
		b = Math.pow(b, 4);
		if (a > b) {
			System.out.println("Наименьшее из квадратов двух чисел = " + b);
		}else {
			System.out.println("Наименьшее из квадратов двух чисел = " + a);
		}

	}

}
