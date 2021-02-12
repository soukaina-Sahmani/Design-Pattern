package DPPrototype;

public class main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// Instancie un objet de classe ConcretePrototypeA
		 // et un autre de classe ConcretePrototypeB
		 // de "mani�re traditionnelle".
		 Prototype lPrototypeA = new concretePA("Original");
		 Prototype lPrototypeB = new concretePB("Original");

		 // Duplique les objets pr�c�demment cr��s/
		 Prototype lPrototypeAClone = lPrototypeA.clone();
		 Prototype lPrototypeBClone = lPrototypeB.clone();

		 // Affiche les objets :
		 // les clones sont identiques aux originaux
		 lPrototypeA.affiche();
		 lPrototypeAClone.affiche();
		 lPrototypeB.affiche();
		 lPrototypeBClone.affiche();

		 // Modifie les clones
		 lPrototypeAClone.setTexte("Clone (enfait)");
		 lPrototypeBClone.setTexte("Clone (enfait)");

		 // Met en �vidence que les clones
		 // sont bien des instances � part.
		 lPrototypeA.affiche();
		 lPrototypeAClone.affiche();
		 lPrototypeB.affiche();
		 lPrototypeBClone.affiche();


	}

}
