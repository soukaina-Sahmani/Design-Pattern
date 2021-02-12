package DPBuilder;

public class objetComplexe {
	
	// Les attributs de l'objet complexe
	 private String attribut1;
	 private Number attribut2;

	 // Les méthodes permettant de fixes les attributs
	 public void setAttribut1(String pAttribut1) {
	 attribut1 = pAttribut1;
	 }

	 public void setAttribut2(Number pAttribut2) {
	 attribut2 = pAttribut2;
	 }

	 /**
	* Méthode permettant d'afficher l'état de l'objet
	* afin de permettre de mettre en évidence
	* les différences de "montage".
	*/
	 public void afficher() {
	 System.out.println("Objet Complexe : ");
	 System.out.println("\t- attribut1 : " + attribut1);
	 System.out.println("\t- attribut2 : " + attribut2);
	 System.out.println("\t- classe de l'attribut2 : " + attribut2.getClass());
	 }


}
