/**

Dog.java
Description:
Author: Vasyl.Boilo@gmail.com
Date: Apr 23, 2023
*/


package chapter3;

class Dog {
	  String name;

	  public static void main(String[] args) {
	    // Створити об'єкт і отримати доступ до нього 
	    Dog dog1 = new Dog();
	    dog1.bark();
	    dog1.name = "Сірко";

	    // Тепер зробіть масив "Собака".
	    Dog[] myDogs = new Dog[3];
	    // and put some dogs in it
	    myDogs[0] = new Dog();
	    myDogs[1] = new Dog();
	    myDogs[2] = dog1;

	    // тепер звертаємось до Dogs з допомогою масиву
	    // посилань
	    myDogs[0].name = "Тузік";
	    myDogs[1].name = "Вухастик";

	    // Hmmmm... як називається myDogs[2]?
	    System.out.print("Останього собаку звати: ");
	    System.out.println(myDogs[2].name);

	    // тепер циклічно переглядаємо масив
	    // і скажи всім собакам гавкати
	    int x = 0;
	    while (x < myDogs.length) {
	      myDogs[x].bark(); 
	      myDogs[x].eat(); 
	      myDogs[x].chaseCat();
	      x = x + 1;
	    }
	  }

	  public void bark() {
	    System.out.println(name + " каже Дзяв!");
	  }

	  public void eat() {
		  System.out.println("ням-ням...");
	  }

	  public void chaseCat() {
		  System.out.println("його-хо пішли ганяти котів...");
	  }
	}
