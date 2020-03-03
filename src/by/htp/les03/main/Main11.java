//11. Составить программу, которая определит площадь какого треугольника больше.

package by.htp.les03.main;

public class Main11 {

	public static void main(String[] args) {
		int a1;
		int h1;
		int a2;
		int h2;
		double s1;
		double s2;
		a1 = 5;
		h1 = 7;
		a2 = 6;
		h2 = 8;
		s1 = 0.5 * a1 * h1;
		s2 = 0.5 * a2 * h2;
		if (s1 > s2) {
			System.out.println("Площадь первого треугольника больше");
		}else {
			System.out.println("Площадь второго треугольника больше");
		}

	}

}
