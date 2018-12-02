package project;

public class RoomFactory implements FactoryInter{
	private int number = 1000;
	public Room giveARoom(String roomType) {
		
		if(roomType.equalsIgnoreCase("Luxurious")) {
			number++;
			Room luxurious = new Luxurious("Glass", number);
			return luxurious;
		}else if(roomType.equalsIgnoreCase("Deluxe")) {
			number++;
			Room deluxe = new Deluxe("Wooden", number);
			return deluxe;
		}else if(roomType.equalsIgnoreCase("Regular")) {
			number++;
			Room regular = new Regular("Brick", number);
			return regular;
		}
		
		return null;
		
	}
}
