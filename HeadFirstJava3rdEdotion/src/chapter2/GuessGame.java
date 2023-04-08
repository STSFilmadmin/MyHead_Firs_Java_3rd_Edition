package chapter2;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Я думаю про число від 0 до 9...");

		while (true) {
			System.out.println("Число для вгадування " + targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();

			guessp1 = p1.number;
			System.out.println("Перший гравець загадав " + guessp1);

			guessp2 = p2.number;
			System.out.println("Другий гравець загадав " + guessp2);

			guessp3 = p3.number;
			System.out.println("Третій гравець загадав " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("У нас є переможець ");
				if (p1isRight == true) {
					System.err.println("Гравець під номером один вгадав! ");
				} else {
					System.err.println("Гравець під номером один не вгадав! ");
				}
				if (p2isRight == true) {
					System.err.println("Гравець під номером два вгадав! ");
				} else {
					System.err.println("Гравець під номером два не вгадав! ");
				}
				if (p3isRight == true) {
					System.err.println("Гравець під номером Три вгадав!");
				} else {
					System.err.println("Гравець під номером три не вгадав! ");

				}

				System.out.println("Game Over");
				break;
			} else {
				System.out.println("Ніхто з тих тупауів не вгадав прийдеться грати знову....");
			}

		}
	}
}
