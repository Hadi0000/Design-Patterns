package project;

import java.util.Scanner;

public abstract class Room {
	public String wallType;
	public int roomNumber;
	protected Wall wall;
	protected DoorAndWindow anyDoorWindow;
	public boolean fireState;
	
	
	public abstract void getRoom();
	
	public boolean ringTheBell() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		return in.nextBoolean();
	}
	public abstract void ringBell();
}
