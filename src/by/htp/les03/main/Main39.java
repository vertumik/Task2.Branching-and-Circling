package by.htp.les03.main;

public class Main39 {

	public static void main(String[] args) {
		double x = 9;
		double y;
		if (x >= 8) {
			y = -Math.pow(x, 2) + x - 9;
		}else {
			y = 1 / (Math.pow(x, 4) - 6);
		}
		System.out.println(y);

	}

}
