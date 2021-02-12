package DPBuilder;


/**
* Contruit un objet en appelant les méthodes d'un "Monteur".
*/
public class Directeur {

 private Monteur monteur;
 
 Directeur(Monteur pMonteur) {
	 monteur = pMonteur;
 }
 
 /**
 * Crée un objet.
 * Appelle les méthodes de création
 * des parties du "Monteur".
 */
  public objetComplexe creerObjet() {
  monteur.creerObjet();

  monteur.creerAttribut1("libelle de l'objet");
  monteur.creerAttribut2(12);

  return monteur.getObjet();
  
  }

 
}