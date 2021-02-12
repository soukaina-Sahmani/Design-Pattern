package DPBuilder;

public abstract class Monteur {

	protected objetComplexe produit;

	 /**
	* Crée un nouveau produit
	* Aucune des parties n'est créée
	* à ce moment là.
	*/
	
	 public void creerObjet()
	 {
	 produit = new objetComplexe();
	 }

	 /**
	* Retourne l'objet une fois fini.
	*/
	 
	 
	 public objetComplexe getObjet() {
          return produit;
	 }
 

 // Les méthodes de création des parties

 public abstract void creerAttribut1(String pAttribut1);
 public abstract void creerAttribut2(double pAttribut2);
}
