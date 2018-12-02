package project;

import java.util.Scanner;

public class Luxurious extends Room{
	public boolean fireState;
	public Luxurious(String wallType, int roomNumber) {
		this.wallType = wallType;
		this.roomNumber = roomNumber;
	}
	@Override
	public void getRoom() {
		// TODO Auto-generated method stub
		System.out.println("It is a luxurious room. Room number: " + roomNumber);
	}
	@Override
	public void ringBell() {
		// TODO Auto-generated method stub
		System.out.println("Bell rang in luxurious room. Room number: " + roomNumber);
	}
	
	
}
