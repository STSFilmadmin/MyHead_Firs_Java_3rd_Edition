/**

hobbits.java
Description:
Author: Vasyl.Boilo@gmail.com
Date: 23 квіт. 2023 р.
*/


package chapter3;

public class hobbits {
	String name;
}
	class HobbitsTestDrive {
	public static void main(String[] args) {
		hobbits[] h = new hobbits[3];
		int z = -1;
		while (z<2) {
			z=z+1;
			h[z] = new hobbits();
			h[z].name = "Bilbo";
			
		if (z==1) {
			h[z].name = "Frodo";
			}
		if (z==2) {
			h[z].name = "Чувачок";
			}
	
		System.out.print(h[z].name+" is a ");
		System.out.println("good Hobit name");
			}
		}
	}
