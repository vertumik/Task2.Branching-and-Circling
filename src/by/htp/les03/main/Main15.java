//15. Даны действительные числа х и у, не равные друг другу. 
//Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.

package by.htp.les03.main;

public class Main15 {

	public static void main(String[] args) {
		double x = 2.5;
		double y = 5.5;
		if (x==y) {
			System.out.println("Числа равны");
		}else if (x < y) {
			x = (x + y) / 2;
			y = x * y * 2;
			System.out.println("Меньшее число x = " + x + " Большее число y = " + y);
		}else {
			y = (x + y) / 2;
			x = x * y * 2;
			System.out.println("Меньшее число y = " + y + " Большее число x = " + x);
		}

	}

}
