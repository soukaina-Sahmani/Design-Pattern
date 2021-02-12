package DPfactoryMethod;

public class FabriqueB extends Fabrique {
	
	/**
	* Méthode de création
	* La méthode ne tient pas compte du paramètre
	* et instancie toujours un objet "ClasseB"
	* @return Un objet de classe ClasseB.
	*/
	 public AbstractClass creerClasse(boolean pIsClasseA) {
	 return new ClasseB();
	 }

}
