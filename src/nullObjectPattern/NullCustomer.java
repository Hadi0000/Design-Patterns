package nullObjectPattern;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNill() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not available in the database";
	}

}
