package project;

public class ProxyFactory implements FactoryInter{
	RoomFactory roomFactory;
	@Override
	public Room giveARoom(String roomType) {
		// TODO Auto-generated method stub
		if(roomFactory == null) {
			//System.out.println("created");
			roomFactory = new RoomFactory();
		}
		return roomFactory.giveARoom(roomType);
	}

}
