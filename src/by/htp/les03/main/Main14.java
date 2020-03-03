//14. Даны два угла треугольника (в градусах).
//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

package by.htp.les03.main;

public class Main14 {

	public static void main(String[] args) {
		int a;
		int b;
		a = 35;
		b = 55;
		if (a + b < 180) {
			System.out.println("Треугольник существует");
			if (a+b==90 || a==90 || b==90) {
				System.out.println("Прямоугольный треугольник");
			}else {
				System.out.println("Не прямоугольный треугольник");
			}
		}else {
			System.out.println("Треугольник не существует");
		}

	}

}
