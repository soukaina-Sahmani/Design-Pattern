package DPMediator;

public class ConcreteMediateur implements Mediateur{
	
	private collegueA collegueA;
	 private collegueB collegueB;
	 
	 // Méthodes permettant les collègues
	 public void setCollegueA(collegueA pCollegueA) {
	 collegueA = pCollegueA;
	 }

	 public void setCollegueB(collegueB pCollegueB) {
		 collegueB = pCollegueB;
	 }

	 /**
	* Si le message provient de A, on le transmet à B
	*/
	 public void transmettreMessageFromA(String pMessage) {
	 collegueB.recevoirMessage(pMessage);
	 }

	 /**
	* Si le message provient de B, on le transmet à A
	*/
	 public void transmettreMessageFromB(String pMessage) {
	 collegueA.recevoirMessage(pMessage);
	 }

	 }


