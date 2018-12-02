package project;

public class ProxyReception implements ReceptionInter{
	Reception recep;
	@Override
	public void getRoomType() {
		// TODO Auto-generated method stub
		if(recep == null) {
			recep = new Reception();
		}
		recep.getRoomType();
	}

	@Override
	public void giveService() {
		// TODO Auto-generated method stub
		if(recep == null) {
			recep = new Reception();
		}
		recep.giveService();
	}

}
