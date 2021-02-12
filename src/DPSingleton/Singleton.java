package DPSingleton;

public class Singleton {
	
	private static final Singleton singleton;
	private int compteur;
	// se charge au d�but d'execution
	static
	{
		singleton = new Singleton();
	}
	
	//constructeur priv�e
	private Singleton() {
		System.out.println("Instanciation du singleton");
	}
	
	public static Singleton getInstence()
	{
		return singleton;
	}
	
	public void traiter(String taskName) 
	{
		System.out.println(".............Traitement de la tache " + taskName);
		for (int i = 0; i < 5; i++)
		{
			++compteur;
			System.out.println(".."+compteur);
			try
			{
				Thread.sleep(1000);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		System.out.println("Fin du traitement de la tache " +taskName+ " compteur = " +compteur);
		
	}

}
