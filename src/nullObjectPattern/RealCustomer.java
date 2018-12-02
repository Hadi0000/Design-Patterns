package nullObjectPattern;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name) {
		this.name = name;
	}
	@Override
	public boolean isNill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
