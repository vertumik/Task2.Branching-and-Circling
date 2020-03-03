//24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», 
//взяв за исходное данное количество лепестков n.

package by.htp.les03.main;

public class Main24 {

	public static void main(String[] args) {
		int n = 8;
		if (n % 2 == 0) {
			System.out.println("любит");
		}else {
			System.out.println("не любит");
		}

	}

}
