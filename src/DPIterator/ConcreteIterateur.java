package DPIterator;

import java.util.Iterator;

public class ConcreteIterateur implements  Iterateur {
	
	private String[] elements;
	 private int index = 0;

	 public ConcreteIterateur(String[] pElements) {
	 elements = pElements;
	 }

	 /**
	* Retourne l'élément
	* puis incrémente l'index
	*/
	 public String suivant() {
	 return elements[index++];
	 }
	 /**
	 * Si l'index est supérieur ou égal
	 * à la taille du tableau,
	 * on considère que l'on a fini
	 * de parcourir les éléments
	 */
	  public boolean fini() {
	  return index >= elements.length;
	  }


}
