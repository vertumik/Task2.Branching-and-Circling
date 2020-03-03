//21. Программа — льстец. На экране высвечивается вопрос 
//«Кто ты: мальчик или девочка? Введи Д или М». 
//В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» 
//или «Мне нравятся мальчики!».


package by.htp.les03.main;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		System.out.print("Кто ты: мальчик или девочка? Введи Д или М: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String ch = sc.nextLine();
		char let1 = ch.charAt(0);
		int i = let1;
		if (i == 1044) {
			System.out.print("Мне нравятся девочки!");
		}else if (i == 1052) {
			System.out.print("Мне нравятся мальчики!");
		}else {
			System.out.print("Введи Д или М: ");
		}
		

	}

}
