package DPAdapter;

public class Test {

	public static void main(String[] args) {
		
		Client client = new Client();
		client.setStandard(new StandardImp1());
		client.process(4, 5);
		
		//adaptateur
		client.setStandard(new Adapter());
		client.process(4, 5);
		
		
		
	}

}
