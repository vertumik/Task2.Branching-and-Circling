//27. Найти max{min(a, b), min(c, d)}.

package by.htp.les03.main;

public class Main27 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 2;
		int d = 4;
		int min1;
		int min2;
		int max;
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}
		System.out.println("max = " + max);

	}

}
