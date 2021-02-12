package DPBuilder;

public class concreteMB extends Monteur {
	
	 /**
	* M�thode de cr�ation de l'attribut attribut1
	* Pr�cise que l'attibut2 repr�sente une dimention en centim�tres
	*/
	
	 public void creerAttribut1(String pAttribut1) {
	 produit.setAttribut1(pAttribut1 +  " (avec dimension en pouces)");
	 }
	 /**
	* M�thode de cr�ation de l'attribut attribut2
	* Stocke la valeur dans un Float sans modification
	*/
	 public void creerAttribut2(double pAttribut2) {
	 produit.setAttribut2(new Double(pAttribut2 * 2.54));
	 }


}
