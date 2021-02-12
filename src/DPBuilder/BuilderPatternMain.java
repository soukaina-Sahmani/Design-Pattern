package DPBuilder;

public class BuilderPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancie les objets directeur et monteur
		
		 Monteur lMonteurA = new concreteMA();
		 Directeur lDirecteurA = new Directeur(lMonteurA);
		 
		 Monteur lMonteurB = new concreteMB();
		 Directeur lDirecteurB = new Directeur(lMonteurB);
		 

		 // Appel des différentes méthodes de création
		 
		 objetComplexe lProduitA = lDirecteurA.creerObjet();
		 objetComplexe lProduitB = lDirecteurB.creerObjet();

		 // Demande l'affichage des valeurs des objets
		 // pour visualiser les différences de composition
		 
		 lProduitA.afficher();
		 lProduitB.afficher();


	}

}
