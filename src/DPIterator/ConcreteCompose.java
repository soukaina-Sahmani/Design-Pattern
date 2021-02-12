package DPIterator;

import java.util.Iterator;

public class ConcreteCompose implements Compose {
	
	// Elements composants l'objet "Compose"
	 private String[] elements = {
	 "Bonjour" , "le", "monde"
	 };
	 /**
	* Retourne un objet "Iterateur" permettant
	* de parcourir les éléments
	*/
	
	 public Iterateur creerIterateur() {
		 return  new ConcreteIterateur(elements);
		 }



}

