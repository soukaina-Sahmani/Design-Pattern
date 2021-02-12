package DPCommand;

public class invoqueur {
	
	// Références vers les commandes
	 private command commandeA;
	 private command commandeB;

	 // Méthodes pour invoquer les commandes
	 public void invoquerA() {
	 if(commandeA != null) {
	 commandeA.executer();
	 }
	 }

	 public void invoquerB() {
		 if(commandeB != null) {
		 commandeB.executer();
		 }
	 }
	// Méthodes pour fixer les commandes
	 public void setCommandeA(command pCommandeA) {
	 commandeA = pCommandeA;
	 }

	 public void setCommandeB(command pCommandeB) {
	 commandeB = pCommandeB;
	 }

}
