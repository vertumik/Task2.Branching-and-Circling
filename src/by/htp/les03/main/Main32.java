//32. Написать программу, 
//которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.

package by.htp.les03.main;

public class Main32 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		a = 4;
		b = 3;
		c = -2;
		if (a+b >0)
			System.out.println("a+b >0");
		if (b+c >0)
			System.out.println("b+c >0");
		if (a+c >0)
			System.out.println("a+c >0");

	}

}
