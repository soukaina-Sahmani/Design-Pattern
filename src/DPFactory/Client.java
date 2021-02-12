package DPFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création des fabriques
		 AbstractFabrique lFactory1 = new ConcreteFabriqueA();
		 AbstractFabrique lFactory2 = new ConcreteFabriqueB();

		 // Création de deux "AbstractClasse" à partir de chaque fabrique
		 AbstractClass lClasse1 = lFactory1.creerClasse();
		 AbstractClass lClasse2 = lFactory2.creerClasse();

		 // Appel d'une méthode d'"AbstractClasse" qui affiche un message
		 // Ce message permet de vérifier que chaque "AbstractClasse"
		 // est en fait une classe différente
		 
		 lClasse1.afficherClasse();
		 lClasse2.afficherClasse();

		 // --------------------------
		 // Affichage :
		 // Objet de classe 'ClasseA'
		 // Objet de classe 'ClasseB'


	}

}
