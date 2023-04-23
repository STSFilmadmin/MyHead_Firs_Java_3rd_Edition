/**

Dog.java
Description:
Author: Vasyl.Boilo@gmail.com
Date: 23 квіт. 2023 р.
*/


package chapter4;

public class Dog {
	int size;
	String name;
		void bark() {
			if (size >60) {
				System.out.println("Woof Woof!");
			}
			else if (size >14) {
				System.out.println("Гав Гав!");
			}
			else {
				System.out.println("Дзяв Дзяв!");
			}
		}
	public static void main(String[] args) {
		Dog one = new Dog();
		Dog two = new Dog();
		Dog thrre = new Dog();
		one.size = 70;
		two.size = 5;
		thrre.size = 40;
		
		one.bark();
		two.bark();
		thrre.bark();
		
	}

}
