package DPfactoryMethod;

public class FactoryMethodPatternMain {

	public static void main(String[] args) {
		
		// Cr�ation des fabriques
		 Fabrique lFactoryA = new FabriquA();
		 Fabrique lFactoryB = new FabriqueB();

		 // L'appel de cette m�thode avec FabriqueA provoquera
		 // l'instanciation de deux classes diff�rentes
		 System.out.println("Avec la FabriqueA : ");
		 lFactoryA.operation();
		 lFactoryA.operation();
		 lFactoryA.operation();
		 
		 // L'appel de cette m�thode avec FabriqueB provoquera
		 // toujours l'instanciation de la m�me classe
		 System.out.println("Avec la FabriqueB : ");
		 lFactoryB.operation();
		 lFactoryB.operation();
		 lFactoryB.operation();


	}

}
