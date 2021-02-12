package DPSingleton;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =1; i < 5; i++) {
			Singleton s = Singleton.getInstence();
			s.traiter("T" + i);
			
		}

	}

}
