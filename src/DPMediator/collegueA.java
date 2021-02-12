package DPMediator;

public class collegueA  extends collegue {
	

	public collegueA(Mediateur pMediateur) {
		 super(pMediateur);
		 pMediateur.setCollegueA(this);
		 }
		 /**
		* M�thode demandant de transmettre un message
		* provenant de cette classe
		* @param pMessage
		*/
		 public void envoyerMessageFromA(String pMessage) {
		 mediateur.transmettreMessageFromA(pMessage);
		 }
		 /**
		 * M�thode recevant un message
		 */
		  public void recevoirMessage(String pMessage) {
		  System.out.println("ConcreteCollegueA a re�u : " + pMessage);
		  }


}
