package edu.handong.csee.java.exceptionhandle.example.prob6;
import java.util.Scanner;

public class Custom_main {
	public static void main(String[] args)
	{
	String name, race;
	int age = 0;
	Scanner keyboard = new Scanner(System.in);
	CustomId obj = new CustomId();
	boolean repeat = true;

	while(repeat)
	{
	try {
	if(obj.getState() == 0) {
	System.out.print("Enter your name: ");
	name = keyboard.nextLine();
	obj.set_name(name);
	}
	else if(obj.getState() == 1) {
	System.out.print("Enter your age: ");
	age = keyboard.nextInt();
	keyboard.nextLine();
	obj.set_age(age);
	}
	
	if(obj.getState() == 2) {
		System.out.print("Enter your race: ");
		race = keyboard.nextLine();
		obj.set_race(race);
		}
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		continue;
		}
		}
		}
		}
