package DPMediator;

public class collegueA  extends collegue {
	

	public collegueA(Mediateur pMediateur) {
		 super(pMediateur);
		 pMediateur.setCollegueA(this);
		 }
		 /**
		* Méthode demandant de transmettre un message
		* provenant de cette classe
		* @param pMessage
		*/
		 public void envoyerMessageFromA(String pMessage) {
		 mediateur.transmettreMessageFromA(pMessage);
		 }
		 /**
		 * Méthode recevant un message
		 */
		  public void recevoirMessage(String pMessage) {
		  System.out.println("ConcreteCollegueA a reçu : " + pMessage);
		  }


}
