package DPBuilder;

public abstract class Monteur {

	protected objetComplexe produit;

	 /**
	* Cr�e un nouveau produit
	* Aucune des parties n'est cr��e
	* � ce moment l�.
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
 

 // Les m�thodes de cr�ation des parties

 public abstract void creerAttribut1(String pAttribut1);
 public abstract void creerAttribut2(double pAttribut2);
}
