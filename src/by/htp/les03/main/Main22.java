//22. Перераспределить значения переменных х и у так, 
//чтобы в х оказалось большее из этих значений, а в y - меньшее.

package by.htp.les03.main;

public class Main22 {

	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int temp;
		if (x > y) {
			System.out.println("x = " + x + " y = " + y);
		}else {
			temp = x;
			x = y;
			y = temp;
			System.out.println("x = " + x + " y = " + y);
		}
		
	}

}
