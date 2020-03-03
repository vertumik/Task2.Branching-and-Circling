//Вычислить значение функции:

package by.htp.les03.main;

public class Main37 {

	public static void main(String[] args) {
		double x = 3;
		double y;
		if (x >= 3) {
			y = -Math.pow(x, 2) + 3 * x + 9;
		}else {
			y = 1 / (Math.pow(x, 3) - 6);
		}
		System.out.println(y);

	}

}
