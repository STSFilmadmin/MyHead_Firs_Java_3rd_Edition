package start;

public class Writing_class_with_main {

	public static void main(String[] args) {
		// оголисити зміну і призначити імя
		int x = 3;							
		String name = "сабля";      
		x = x * 27;
		System.out.println("x це " + x);
		double d = Math.random();
		System.out.println(d);
		// це комент

		// робити щось знову і знову
		// Цикли for i while
		while (x > 12) {
			x = x - 1;
			System.out.println(x);
		}
		for (int i = 0; i < 10; i = i + 1) { // i = i + 1 те саме що i++
			System.out.println("i зараз " + i);

		}
		if (x == 12) {
			System.out.println("х має бути 12");
		} else {
			System.out.println("x не є десять ");
		}
		if ((x<3) && (name.equals(name)));{
			System.out.println("Ти шо Важєй...");
		}
		

	}

}
/*Кожен оператор повинен завершуватись крапкою з комою. x = x + 1;
 * Однорядковий коментар починається з двох слешів //
 * Більшість пробілів не мають значення.  x     =         3       ;
 * Змінні оголошуються з іменем та типом (ви дізнаєтесь про всі типи Java у Розділі 3). int weight; //type: int, name: weight * 
 * Класи та методи повинні бути визначені всередині фігурних дужок. public void go() {  неймовірний код тут }
 */