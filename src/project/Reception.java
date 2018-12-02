package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reception implements ReceptionInter{
	private Room anyRoom;
	private String roomType;
	private FactoryInter proxyFactory;
	private List<Room> allRooms = new ArrayList<Room>();
	private boolean fireState=false;
	
	
	public Reception() {
		proxyFactory = new ProxyFactory();
	}
	public void getRoomType() {
		System.out.println("1. luxurious, 2. Deluxe, 3. Regular.");
		Scanner in = new Scanner(System.in);
		roomType = in.nextLine();
		//proxyFactory = new ProxyFactory();
		anyRoom = proxyFactory.giveARoom(roomType);
		allRooms.add(anyRoom);
		anyRoom.getRoom();
	}
	public void giveService() {
		RoomBuilder buildRoom = new RoomBuilder(anyRoom);
		buildRoom.prepareRoom();
		anyRoom.wall.type();
		anyRoom.anyDoorWindow.type();
		anyRoom.anyDoorWindow.activity();
		anyRoom.anyDoorWindow.uses();
		fireState = anyRoom.ringTheBell();
		changeState(fireState);
	}
	private void changeState(boolean fireState) {
		this.fireState = fireState;
		if(fireState == true) {
			for(Room rooms : allRooms) {
				rooms.ringBell();
			}
		}
	}
}
