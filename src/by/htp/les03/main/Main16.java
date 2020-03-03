//16. На плоскости ХОY задана своими координатами точка А. 
//Указать, где она расположена (на какой оси или в каком координатном угле).


package by.htp.les03.main;

public class Main16 {

	public static void main(String[] args) {
		int x = 3;
		int y = -2;
		if (x == 0 && y == 0) {
			System.out.println("В начале координат");
		}else if (x == 0 && y != 0) {
			System.out.println("На оси Y");
		}else if (x != 0 && y == 0) {
			System.out.println("На оси X");
		}else if (x > 0 && y > 0) {
			System.out.println("В 1 четверти");
		}else if (x < 0 && y > 0) {
			System.out.println("В 2 четверти");
		}else if (x < 0 && y < 0) {
			System.out.println("В 3 четверти");
		}else {
			System.out.println("В 4 четверти");
		}

	}

}
