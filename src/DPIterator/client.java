package DPIterator;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Cr�ation de l'objet "Compose"
		 Compose lCompose = new ConcreteCompose();
		 // Cr�ation de l'objet "Iterateur"
		 Iterateur lIterateur = lCompose.creerIterateur();

		 // Parcours les �l�ments de l'objet "Compose"
		 // gr�ce � l'objet "Iterateur"
		 while(!lIterateur.fini()) {
		 System.out.println(lIterateur.suivant());
		 }


	}

}
