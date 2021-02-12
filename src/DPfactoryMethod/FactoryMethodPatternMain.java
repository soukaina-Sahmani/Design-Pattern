package DPfactoryMethod;

public class FactoryMethodPatternMain {

	public static void main(String[] args) {
		
		// Création des fabriques
		 Fabrique lFactoryA = new FabriquA();
		 Fabrique lFactoryB = new FabriqueB();

		 // L'appel de cette méthode avec FabriqueA provoquera
		 // l'instanciation de deux classes différentes
		 System.out.println("Avec la FabriqueA : ");
		 lFactoryA.operation();
		 lFactoryA.operation();
		 lFactoryA.operation();
		 
		 // L'appel de cette méthode avec FabriqueB provoquera
		 // toujours l'instanciation de la même classe
		 System.out.println("Avec la FabriqueB : ");
		 lFactoryB.operation();
		 lFactoryB.operation();
		 lFactoryB.operation();


	}

}
