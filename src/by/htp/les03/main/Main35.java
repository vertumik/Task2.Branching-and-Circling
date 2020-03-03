//35. Вычислить число и месяц в невисокосном году по номеру дня.

package by.htp.les03.main;

public class Main35 {

	public static void main(String[] args) {
		int num = 127;
		int i = 0;
		int[] month = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		for (; num > month[i]; i++) {
			num -= month[i];
		}
		switch (i){
        case 0:
            System.out.print("Январь ");
            break;
        case 1:
        	System.out.print("Февраль ");
            break;
        case 2:
        	System.out.print("Март ");
            break;
        case 3:
        	System.out.print("Апрель ");
            break;
        case 4:
        	System.out.print("Май ");
            break;
        case 5:
        	System.out.print("Июнь ");
            break;
        case 6:
        	System.out.print("Июль ");
            break;
        case 7:
        	System.out.print("Август ");
            break;
        case 8:
        	System.out.print("Сентябрь ");
            break;
        case 9:
        	System.out.print("Октябрь ");
            break;
        case 10:
        	System.out.print("Ноябрь ");
            break;
        case 11:
        	System.out.print("Декабрь");
            break;
		}
		System.out.println(num);

	}

}
