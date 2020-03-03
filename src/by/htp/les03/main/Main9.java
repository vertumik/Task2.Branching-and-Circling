//9. Составить программу, которая определит по трем введенным сторонам, 
//является ли данный треугольник равносторонним.

package by.htp.les03.main;

public class Main9 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		a = 4;
		b = 3;
		c = 5;
		if ((a == b) || (b == c) || (a == c)) {
			System.out.println("Данный треугольник является равносторонним");
		}else {
			System.out.println("Данный треугольник не является равносторонним");
		}

	}

}
