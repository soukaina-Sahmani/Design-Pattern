package DPfactoryMethod;

public class FabriquA extends Fabrique {
	
	/**
	* Méthode de création
	* La méthode retourne un objet ClasseA, si le paramètre est true.
	* La méthode retourne un objet ClasseB, sinon.
	* @return Un objet de classe ClasseA ou ClasseB.
	*/
	 public AbstractClass creerClasse(boolean pIsClasseA) {
	 if(pIsClasseA) {
	 return new ClasseA();
	 }
	 else {
	 return new ClasseB();
	 }}
}
