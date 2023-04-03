package start;

class IfTest2 {
	  public static void main(String[] args) {
	    int x = 2;										//оголосити зміну xі призначити їй значення: 2
	    if (x == 3) {									// якщо х дорівнюює 3 то виконати умову у фігурних дужках {}
	      System.out.println("x must be 3");			//якщо х дорівнює 3 то буде виведено  текст x must be 3 у командну строку 
	    } else {										// інакше виконати наступну умову .... 
	      System.out.println("x is NOT 3");				// вивести в командний рядок: x is NOT 3
	    }
	    System.out.println("This runs no matter what / а цей рядок буде виведений незвазаючи нінащо так як він поза межами циклу ");	// а цей рядок буде виведений незвазаючи нінащо так як він поза межами циклу 
	  }
	}