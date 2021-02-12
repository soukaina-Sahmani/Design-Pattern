package DPIterator;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Création de l'objet "Compose"
		 Compose lCompose = new ConcreteCompose();
		 // Création de l'objet "Iterateur"
		 Iterateur lIterateur = lCompose.creerIterateur();

		 // Parcours les éléments de l'objet "Compose"
		 // grâce à l'objet "Iterateur"
		 while(!lIterateur.fini()) {
		 System.out.println(lIterateur.suivant());
		 }


	}

}
