//13. Даны две точки А(х1, у1) и В(х2, у2). 
//Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.

package by.htp.les03.main;

public class Main13 {

	public static void main(String[] args) {
		int x1 = 5;
		int y1 = 3;
		int x2 = 4;
		int y2 = 6;
		if (x1*x1+y1*y1<x2*x2+y2*y2) {
			System.out.println("Первая точка ближе");
		}else if (x1*x1+y1*y1>x2*x2+y2*y2) {
			System.out.println("Вторая точка ближе");
		}else {
			System.out.println("Точки на одинаковом расстоянии");
		}

	}

}
