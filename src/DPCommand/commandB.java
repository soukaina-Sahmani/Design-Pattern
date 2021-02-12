package DPCommand;

public class commandB implements command {
	
	private Recepteur recepteur;

	 public commandB(Recepteur pRecepteur) {
	 recepteur = pRecepteur;
	 }

	 public void executer() {
	 recepteur.action2();
	 }

}
