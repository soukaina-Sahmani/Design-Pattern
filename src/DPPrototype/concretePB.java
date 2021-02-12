package DPPrototype;

public class concretePB extends Prototype {
	

	 public concretePB(String pTexte) {
		 super(pTexte);
		 }
		 /**
		* Méthode d'affichage.
		* Indique que c'est un objet de classe ConcretePrototypeA
		* et la valeur de l'attribut texte.
		*/
		 public void affiche() {
		 System.out.println("ConcretePrototypeB avec texte : " + texte);
		 }


}
