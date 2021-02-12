package DPBuilder;

public class BuilderPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancie les objets directeur et monteur
		
		 Monteur lMonteurA = new concreteMA();
		 Directeur lDirecteurA = new Directeur(lMonteurA);
		 
		 Monteur lMonteurB = new concreteMB();
		 Directeur lDirecteurB = new Directeur(lMonteurB);
		 

		 // Appel des diff�rentes m�thodes de cr�ation
		 
		 objetComplexe lProduitA = lDirecteurA.creerObjet();
		 objetComplexe lProduitB = lDirecteurB.creerObjet();

		 // Demande l'affichage des valeurs des objets
		 // pour visualiser les diff�rences de composition
		 
		 lProduitA.afficher();
		 lProduitB.afficher();


	}

}
