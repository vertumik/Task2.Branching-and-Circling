//30. Даны действительные числа а,b,с. 
//Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если
//это не так.

package by.htp.les03.main;

public class Main30 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		a = 2.5;
		b = -3.7;
		c = -4.3;
		if ((a > b) && (b > c)) {
			a *= 2;
			b *= 2;
			c *= 2;
		}else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
