/**
SharpenYourPencil.java
Description:
Author: Vasyl.Boilo@gmail.com
Date: Apr 22, 2023

			   This table reserved (Ця таблиця зарезервована)
			 
	_			catch		double		float			int			private		super			true
	abstract	char		else		for				interface	protected	switch			try
	assert		class		enum		goto			long		public		synchronized	void
	boolean		const		extends		if				native		return		this			volatile
	break		continue	false		implements		new			short		throw			while
	byte		default		final		import			null		static		throws	
	case		do			finally		instanceof		package		strictfp	transient
	*/

package chapter3;
import java.util.Scanner;


public class SharpenYourPencil {

	public static void main(String[] args) {
			System.out.println("Введи початкове число:");
		  	Scanner scan =  new Scanner(System.in);
		  	int  g = scan.nextInt();
		    scan.close();
//		    int x = 34.5; 			так не можна 
//		    boolean boo = x;		так тоже не можна 
		    int g2 = 17;
		    int y = g;
		    y = y + 10;
		    
		    short s = 1;
		    System.out.println(s);
//		    s = y;				//не вірний вираз різні типи змінних.... не влізе...
		    byte b = 3;
		    byte v = b;
		    System.out.println(b+" "+v+" "+(b+v)+g2);
		  
		    int zminna_x;
			zminna_x = 5;
			System.out.println(zminna_x);
			zminna_x = 52;
			System.out.println(zminna_x);
			zminna_x = zminna_x + 5;
			System.out.println(zminna_x);
			char zminna_C;
			zminna_C = 'ї';
			System.out.println(zminna_C);
			float f = 3.2445454e5f;
			System.out.println(f);
			double d = 1598.632323e3;
			System.err.println(d);
		  }

	}


