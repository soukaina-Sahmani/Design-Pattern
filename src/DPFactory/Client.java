package DPFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cr�ation des fabriques
		 AbstractFabrique lFactory1 = new ConcreteFabriqueA();
		 AbstractFabrique lFactory2 = new ConcreteFabriqueB();

		 // Cr�ation de deux "AbstractClasse" � partir de chaque fabrique
		 AbstractClass lClasse1 = lFactory1.creerClasse();
		 AbstractClass lClasse2 = lFactory2.creerClasse();

		 // Appel d'une m�thode d'"AbstractClasse" qui affiche un message
		 // Ce message permet de v�rifier que chaque "AbstractClasse"
		 // est en fait une classe diff�rente
		 
		 lClasse1.afficherClasse();
		 lClasse2.afficherClasse();

		 // --------------------------
		 // Affichage :
		 // Objet de classe 'ClasseA'
		 // Objet de classe 'ClasseB'


	}

}
