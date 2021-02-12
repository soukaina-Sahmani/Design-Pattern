package DPstrategy2;

public class Reine extends Personnage {

	public  Reine() {
		this.comportementArme =new ComportementArcEtFleche();
		
	}
	
	@Override
	public void combattre() {
	    score +=4;
		System.out.println("Je suis une reine.........");
		this.comportementArme.utiliserArme();
		System.out.println(" le score est : " + score);
		if(score>12)
		
			this.setComportementArme(new ComportementHache());
		
		
	}

}
