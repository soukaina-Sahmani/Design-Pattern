package DPfactoryMethod;

public abstract class Fabrique {
	

	private boolean pIsClasseA = false;
	 /**
	* M�thode de cr�ation
	*/
	 public abstract AbstractClass creerClasse(boolean pIsClasseA);

	 /**
	* M�thode appelant la m�thode de cr�ation.
	* 
* Puis, effectuant une op�ration.
*/

	 public void operation() 
	 {
		 // Change la valeur afin de varier le param�tre
		 // de la m�thode de cr�ation
		 pIsClasseA = !pIsClasseA;

		 // R�cup�re une instance de classe "AbstractClasse"
		 AbstractClass lClasse = creerClasse(pIsClasseA);

		 // Appel la m�thode d'affichage de la classe
		 // afin de savoir la classe concr�te
		 lClasse.afficherClasse();
	 }


}
