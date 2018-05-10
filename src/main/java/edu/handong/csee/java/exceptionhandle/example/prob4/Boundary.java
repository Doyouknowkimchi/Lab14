package edu.handong.csee.java.exceptionhandle.example.prob4;

public class Boundary { // method name
	private static int [] arr = new int[5]; // variable
	private static int cnt = 0; //variable
	public void receive(int num) throws ArrayIndexOutOfBoundsException //throw block
	{
		int i = cnt; // set i
		arr[i] = num; // set arr
		cnt++; // add cnt 
		System.out.printf("arr[%d] <- %d\n", i, num); //show text
	}
}
