package project;

public class RoomBuilder {
	public Room anyRoom;
	
	public RoomBuilder(Room anyRoom) {
		this.anyRoom = anyRoom;
	}
	
	public void prepareRoom() {
		if(anyRoom.wallType.equalsIgnoreCase("glass")) {
			prepareLuxuriousRoom();
		}else if(anyRoom.wallType.equalsIgnoreCase("wooden")) {
			prepareDeluxeRoom();
		}else if(anyRoom.wallType.equalsIgnoreCase("brick")) {
			prepareRegularRoom();
		}
	}
	public void prepareLuxuriousRoom() {
		//WDWFactory wdw = new WDWFactory();
		//wdw.getWallDoorAndWindow(anyRoom.wallType);
		anyRoom.wall = new GlassWall();
		anyRoom.anyDoorWindow = new SlidingDoorAndWindow();
		//anyRoom.
	}
	public void prepareDeluxeRoom() {
		anyRoom.wall = new WoodenWall();
		anyRoom.anyDoorWindow = new SteelDoorAndWindow();
	}
	public void prepareRegularRoom() {
		anyRoom.wall = new BrickWall();
		anyRoom.anyDoorWindow = new WoodenDoorAndWindow();
	}
}
