package DPfactoryMethod;

public class FabriquA extends Fabrique {
	
	/**
	* M�thode de cr�ation
	* La m�thode retourne un objet ClasseA, si le param�tre est true.
	* La m�thode retourne un objet ClasseB, sinon.
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
