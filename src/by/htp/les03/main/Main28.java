//28. Даны три числа a, b, с. 
//Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c).

package by.htp.les03.main;

public class Main28 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		int d = 2;
		int max;
		if (a == d)
			System.out.println("a = d = " + d);
		if (b == d)
			System.out.println("b = d = " + d);
		if (c == d)
			System.out.println("c = d = " + d);
		if (d - a > d - b && d - a > d - c) {
			max = d - a;
			}
		else if (d - b > d - a && d - b > d - c) {
			max = d-b;
			}
		else {
			max = d - c;
			}
		System.out.println("max = " + max);

	}

}
