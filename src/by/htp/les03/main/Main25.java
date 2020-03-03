//25. Написать программу — модель анализа пожарного датчика в помещении, 
//которая выводит сообщение «Пожароопасная ситуация », если температура в комнате превысила 60° С.

package by.htp.les03.main;

public class Main25 {

	public static void main(String[] args) {
		int temp = 50;
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация, температура в комнате " + temp);
		}else {
			System.out.println("Температура в комнате " + temp);
		}

	}

}
