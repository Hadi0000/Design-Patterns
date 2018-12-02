package project;

public class Deluxe extends Room{

	public Deluxe(String wallType, int roomNumber) {
		this.wallType = wallType;
		this.roomNumber = roomNumber;
	}
	@Override
	public void getRoom() {
		// TODO Auto-generated method stub
		System.out.println("It is a Deluxe room. Room number: " + roomNumber);
	}
	@Override
	public void ringBell() {
		// TODO Auto-generated method stub
		System.out.println("Bell rang in Deluxe room. Room number: " + roomNumber);
	}
	
	
	

}
