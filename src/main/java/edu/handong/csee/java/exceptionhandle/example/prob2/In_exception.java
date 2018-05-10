package edu.handong.csee.java.exceptionhandle.example.prob2;
import java.util.*;

public class In_exception { // class name
		private int x = 0, y = 0; // variable

		public In_exception() // constructor
		{}
		public void error_det() { // method

			try{ //try block
				Scanner keyboard = new Scanner(System.in); // ready to get input from keyboard
				System.out.print("x: "); // show 
				x = keyboard.nextInt(); // get variable
				System.out.print("y: "); // show
				y = keyboard.nextInt(); // get variable
				System.out.println(this.x/this.y); // show
			}
			catch(ArithmeticException e){ //catch block
				System.out.println("java.lang.ArithmeticException: " + e.getMessage()); // show
			}
			catch(InputMismatchException e){ //catch block // catch block
				System.out.println("java.util.InputMismatchException"); // show
			}
			catch(Exception e) { //catch block
				System.out.println("Some other exception has occurred: " + e.getMessage()); // show
			}
		}
	}
