package DPMediator;

public class collegueB  extends collegue {
	

	public collegueB(Mediateur pMediateur) {
		 super(pMediateur);
		 pMediateur.setCollegueB(this);
		 }
		 /**
		* M�thode demandant de transmettre un message
		* provenant de cette classe
		* @param pMessage
		*/
		 public void envoyerMessageFromB(String pMessage) {
		 mediateur.transmettreMessageFromB(pMessage);
		 }
		 /**
		 * M�thode recevant un message
		 */
		  public void recevoirMessage(String pMessage) {
		  System.out.println("ConcreteCollegueB a re�u : " + pMessage);
		  }


}
