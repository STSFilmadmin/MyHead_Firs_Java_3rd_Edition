package start; 			//  приклад циклу з книжки 

public class Loopy {
	  public static void main(String[] args) {
	    int x = 1;
	    System.out.println("Перед чиклом ");
	    while (x < 4) {
	      System.out.println("у циклі ");
	      System.out.println("зміна  x дорівнює " + x);
	      x = x + 1;
	    }
	    System.out.println("This is after the loop/Це після циклу");
	  }
	}
