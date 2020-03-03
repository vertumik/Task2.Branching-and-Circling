//17. Даны целые числа m, n. Если числа не равны, 
//то заменить каждое из них одним и тем же числом, равным большему из исходных, 
//а если равны, то заменить числа нулями.

package by.htp.les03.main;

public class Main17 {

	public static void main(String[] args) {
		int m = 9;
		int n = 8;
		if (m == n) {
			m = 0;
			n = 0;
			System.out.println("Числа равны " + m + " и " + n);
		}else if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("Числа равны большему и = " + m);
			}else {
				m = n;
				System.out.println("Числа равны большему и = " + n);
			}
		}

	}

}
