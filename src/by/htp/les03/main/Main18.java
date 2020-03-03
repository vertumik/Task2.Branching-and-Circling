//18. Подсчитать количество отрицательных среди чисел а, b, с.

package by.htp.les03.main;

public class Main18 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = -4;
		int k = 0;
		if (a < 0) {
			k = k + 1;
		}
		if (b < 0) {
			k = k + 1;
		}
		if (c < 0) {
			k = k + 1;
		}
		System.out.println(k);
	}

}
