package DPCommand;

public class commandA implements command {
	
	private Recepteur recepteur;

	 public commandA(Recepteur pRecepteur) {
	 recepteur = pRecepteur;
	 }

	 public void executer() {
	 recepteur.action1();
	 }

}
