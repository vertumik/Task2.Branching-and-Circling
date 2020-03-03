//10. Составить программу, которая определит площадь какого круга меньше

package by.htp.les03.main;

public class Main10 {

	public static void main(String[] args) {
		int r1;
		int r2;
		r1 = 9;
		r2 = 7;
		double s1;
		double s2;
		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);
		if (s1 < s2) {
			System.out.println("Площадь второго круга больше");
		}else {
			System.out.println("Площадь первого круга больше");
		}

	}

}
