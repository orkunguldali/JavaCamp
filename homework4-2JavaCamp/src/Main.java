
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Orkun","G�ldal�","12345678910"));
		
		
	}

}
