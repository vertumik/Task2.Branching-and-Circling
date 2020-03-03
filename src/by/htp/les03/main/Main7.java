//7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х

package by.htp.les03.main;

public class Main7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int sum;
		a = 4;
		b = 6;
		c = 2;
		x = 2;
		sum = Math.abs(a * x * x + b * x + c);
		System.out.println("Модуль выражения = " + sum);

	}

}
