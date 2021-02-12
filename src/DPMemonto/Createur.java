package DPMemonto;

public class Createur {
	
	// Etat � sauvegarder
	 private int etat = 2;
	 /**
	* Contient la sauvegarde d'un �tat d'un objet.
	* Ses m�thodes sont priv�es, afin que seul le "Createur"
	* acc�de aux informations stock�es
	*/
	 public class Memento {
	 // Etat sauvegard�
	 private int etat;

	 private Memento(int pEtat) {
	 etat = pEtat;
	 }

	 /**
	* Retourne l'�tat sauvegard�
	* @return
	*/
	 private int getEtat() {
	 return etat;
	 }
	 }
	 /**
	* Fait varier l'�tat de l'objet
	* */
 public void suivant() {
 etat = etat * etat;
 }

 /**
* Sauvegarde son �tat dans un "Memento"
* @return
*/
 public Memento sauverDansMemento() {
 return new Memento(etat);
 }

 /**
* Restitue son �tat depuis un "Memento"
* @param pMemento
*/
 public void restaurerDepuisMemento(Memento pMemento) {
 etat = pMemento.getEtat();
 }

 /**
* Affiche l'�tat de l'objet
*/
 public void afficher() {
 System.out.println("L'etat vaut : " + etat);
 }


}
