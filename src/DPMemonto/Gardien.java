package DPMemonto;

import java.util.LinkedList;
import java.util.List;

public class Gardien {
	
	// Liste de "Memento"
	 private List<Createur.Memento> liste = new LinkedList<Createur.Memento>();

	 /**
	* Ajouter un "Memento" � la liste
	* @param pMemento
	*/
	 public void ajouterMemento(Createur.Memento pMemento) {
	 liste.add(pMemento);
	 }

	 /**
	* Retourne le "Memento" correspondant � l'index
	* @param pIndex
	* @return
	*/
	 public Createur.Memento getMemento(int pIndex) {
	 return liste.get(pIndex);

}
}