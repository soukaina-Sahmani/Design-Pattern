package DPstrategy2;

public class Roi extends Personnage {

	public  Roi() {
		this.comportementArme =new ComportementHache();
		
	}
	@Override
	public void combattre() {
		System.out.println("Je suis un roi........");
		this.comportementArme.utiliserArme();
	}
	
	
	


}
