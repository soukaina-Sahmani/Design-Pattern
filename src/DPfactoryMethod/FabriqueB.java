package DPfactoryMethod;

public class FabriqueB extends Fabrique {
	
	/**
	* M�thode de cr�ation
	* La m�thode ne tient pas compte du param�tre
	* et instancie toujours un objet "ClasseB"
	* @return Un objet de classe ClasseB.
	*/
	 public AbstractClass creerClasse(boolean pIsClasseA) {
	 return new ClasseB();
	 }

}
