//Вычислить значение функции:

package by.htp.les03.main;

public class Main36 {

	public static void main(String[] args) {
		double x = 3;
		double y;
		if (x <= 3) {
			y = x * x - 3 * x + 9;
		}else {
			y = 1 / (x * x * x + 6);
		}
		System.out.print(y);

	}

}
