package DPfactoryMethod;

public abstract class Fabrique {
	

	private boolean pIsClasseA = false;
	 /**
	* Méthode de création
	*/
	 public abstract AbstractClass creerClasse(boolean pIsClasseA);

	 /**
	* Méthode appelant la méthode de création.
	* 
* Puis, effectuant une opération.
*/

	 public void operation() 
	 {
		 // Change la valeur afin de varier le paramètre
		 // de la méthode de création
		 pIsClasseA = !pIsClasseA;

		 // Récupère une instance de classe "AbstractClasse"
		 AbstractClass lClasse = creerClasse(pIsClasseA);

		 // Appel la méthode d'affichage de la classe
		 // afin de savoir la classe concrète
		 lClasse.afficherClasse();
	 }


}
