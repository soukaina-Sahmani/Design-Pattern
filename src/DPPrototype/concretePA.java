package DPPrototype;

public class concretePA extends Prototype {
	

	 public concretePA(String pTexte) {
		 super(pTexte);
		 }
		 /**
		* M�thode d'affichage.
		* Indique que c'est un objet de classe ConcretePrototypeA
		* et la valeur de l'attribut texte.
		*/
		 public void affiche() {
		 System.out.println("ConcretePrototypeA avec texte : " + texte);
		 }


}
