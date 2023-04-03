package start;

public class BottleSong {

	public static void main(String[] args) {
		int bootleNum = 99;
		String bootle = "пляшок";
			System.out.println("Пісенька про 99 пляшок пива");
		while (bootleNum > 0) {
			if (bootleNum > 0) {
				System.out.println(bootleNum + " " + bootle + " пива на стіні, " + bootleNum + " " + bootle + " пива.");
				System.out.println("Візьми одну та передай");
			}
			bootleNum--;
			if (bootleNum < 5) {
				bootle = "пляшки";
			}
			if (bootleNum == 1) {
				bootle = "пляшка";
			}
		}
		bootle = "пляшок";
		System.out.println("Немає більше " + bootle
				+ " пива на стіні, іди в магазин і купи ще, 99 пляшок пива..."); //
	}

}
