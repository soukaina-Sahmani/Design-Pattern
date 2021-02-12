package DPIterator;

import java.util.Iterator;

public class ConcreteIterateur implements  Iterateur {
	
	private String[] elements;
	 private int index = 0;

	 public ConcreteIterateur(String[] pElements) {
	 elements = pElements;
	 }

	 /**
	* Retourne l'�l�ment
	* puis incr�mente l'index
	*/
	 public String suivant() {
	 return elements[index++];
	 }
	 /**
	 * Si l'index est sup�rieur ou �gal
	 * � la taille du tableau,
	 * on consid�re que l'on a fini
	 * de parcourir les �l�ments
	 */
	  public boolean fini() {
	  return index >= elements.length;
	  }


}
