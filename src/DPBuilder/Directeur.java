package DPBuilder;


/**
* Contruit un objet en appelant les m�thodes d'un "Monteur".
*/
public class Directeur {

 private Monteur monteur;
 
 Directeur(Monteur pMonteur) {
	 monteur = pMonteur;
 }
 
 /**
 * Cr�e un objet.
 * Appelle les m�thodes de cr�ation
 * des parties du "Monteur".
 */
  public objetComplexe creerObjet() {
  monteur.creerObjet();

  monteur.creerAttribut1("libelle de l'objet");
  monteur.creerAttribut2(12);

  return monteur.getObjet();
  
  }

 
}