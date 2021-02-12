package DPFactory;

public class ConcreteFabriqueA implements AbstractFabrique{
	
	/**
	* La m�thode de cr�ation instancie un objet "ClasseA".
	* @return Un objet "ClasseA" qui vient d'�tre cr��.
	*/
	 public AbstractClass creerClasse() {
	 return new ClassA();
	 }


}
