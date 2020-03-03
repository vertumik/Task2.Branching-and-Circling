//29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
//Определить, будут ли они расположены на одной прямой.

package by.htp.les03.main;

public class Main29 {

	public static void main(String[] args) {
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		x1 = 3;
		y1 = 2;
		x2 = 5;
		y2 = 2;
		x3 = 7;
		y3 = 2;
		if ((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3)==0) {
			System.out.println("Точки на одной прямой");
		}else {
			System.out.println("Точки не на одной прямой");
		}

	}

}
