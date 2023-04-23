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
		void bark(int d) {
						while (d > 0){
														if (size >60) {
															System.out.println("Woof Woof!");
															}
															else if (size >14) { 
																			System.out.println("Гав Гав!");
																	}
																		else {
																						System.out.println("Дзяв Дзяв!");
																						//System.out.println(d);
																			}
										d=d-1;
						}
		}
	public static void main(String[] args) {
		Dog one = new Dog();
		Dog two = new Dog();
		Dog thrre = new Dog();
		one.size = 70;
		two.size = 5;
		thrre.size = 40;
		
		one.bark(2);
		two.bark(8);
		thrre.bark(3);
		
	}

}
