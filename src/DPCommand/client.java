package DPCommand;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recepteur lRecepteur = new Recepteur();

		 // Cr�ation des commandes
		 command lCommandeA = new commandA(lRecepteur);
		 command lCommandeB = new commandB(lRecepteur);
		 
		 // Cr�ation et initialisation de l'invoqueur
		 invoqueur lInvoqueur = new invoqueur();
		 
		lInvoqueur.setCommandeA(lCommandeA);
		 lInvoqueur.setCommandeB(lCommandeB);

		 lInvoqueur.invoquerA();
		 lInvoqueur.invoquerB();
		 System.out.println("VIDE");


	}

}
