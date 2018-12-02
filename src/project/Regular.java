package project;

public class Regular extends Room{

	public Regular(String wallType, int roomNumber) {
		this.wallType = wallType;
		this.roomNumber = roomNumber;
	}
	@Override
	public void getRoom() {
		// TODO Auto-generated method stub
		System.out.println("It is a regular room. Room number: "+ roomNumber);
	}
	@Override
	public void ringBell() {
		// TODO Auto-generated method stub
		System.out.println("Bell Rang in Regular room. Room number: " + roomNumber);
	}
	
	

}
