//31. Заданы размеры А, В прямоугольного отверстия 
//и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

package by.htp.les03.main;

public class Main31 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;
		a = 7;
		b = 10;
		x = 5;
		y = 4;
		z = 2;
		if ((x<a) && (y<b) || (x<b) && (y<a)){
		System.out.println("Пройдет");
		}
		else if ((x<a) && (z<b) || (x<b) && (z<a)) {
		System.out.println("Пройдет");
		}
		else if ((y<a) && (z<b) || (y<b) && (z<a)) {
		System.out.println("Пройдет");
		}
		else {
		System.out.println("Не пройдет");
		}

	}

}
