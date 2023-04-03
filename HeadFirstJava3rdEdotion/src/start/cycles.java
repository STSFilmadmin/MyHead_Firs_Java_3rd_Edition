package start;		

public class cycles {				// приклад циклу - while() {}

	public static void main(String[] args) {
			int x = 27, z = 15;
			while (x > 5) {
				System.out.print(" Значення Х більше 5");
				x--;										// буде кожен цикл віднімати 1 від х
				System.out.println("X = "+ x);				// Буде виводитись до тих пір поки х не стане 4
				while (z==27) {
					System.out.println("z = 27");			// ніколи не буде виведено тому що z  не дорівнює 27
				}
			}
	}

}
