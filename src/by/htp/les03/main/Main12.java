//12. Даны три действительных числа. 
//Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

package by.htp.les03.main;

public class Main12 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		a = 23.12;
		b = 12.24;
		c = -5.15;
		if (a > 0) {
			a = Math.pow(a, 2);
			System.out.println("Положительное в квадрате = " + a);
		}else {
			a = Math.pow(a, 4);
			System.out.println("Отрицательное в четвертой степени = " + a);
		}
		if (b > 0) {
			b = Math.pow(b, 2);
			System.out.println("Положительное в квадрате = " + b);
		}else {
			b = Math.pow(b, 4);
			System.out.println("Отрицательное в четвертой степени = " + b);
		}
		if (c > 0) {
			c = Math.pow(c, 2);
			System.out.println("Положительное в квадрате = " + c);
		}else {
			c = Math.pow(c, 4); 
			System.out.println("Отрицательное в четвертой степени = " + c);
		}
		
	}

}
