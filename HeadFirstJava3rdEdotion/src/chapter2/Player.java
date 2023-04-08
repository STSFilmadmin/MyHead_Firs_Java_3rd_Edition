package chapter2;

import java.util.Random;

public class Player {
	 int number;
	public void guess() {
		Random ugadayka  = new Random();
		number = ugadayka.nextInt(10);
	}

}
