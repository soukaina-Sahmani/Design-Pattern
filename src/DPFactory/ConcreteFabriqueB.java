package DPFactory;

public class ConcreteFabriqueB implements AbstractFabrique{
	
	/**
	* La méthode de création instancie un objet "ClasseA".
	* @return Un objet "ClasseA" qui vient d'être créé.
	*/
	 public AbstractClass creerClasse() {
	 return new ClassB();
	 }


}
