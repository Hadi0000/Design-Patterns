package nullObjectPattern;

public class NullPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCustomer customer1 = CustomerFactory.getCustomer("rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Joe");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Hadi");
		
		System.out.println("Customer");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
