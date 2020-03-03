//20. Определить, делителем каких чисел а, b, с является число k.

package by.htp.les03.main;

public class Main20 {

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = 12;
		int k = 4;
		if (a % k == 0) {
			System.out.println("k делитель a");
		}else if (b % k == 0) {
			System.out.println("k делитель b");
		}else if (c % k == 0) {
			System.out.println("k делитель c");
		}else {
			System.out.println("k делителем не является");
		}

	}

}
