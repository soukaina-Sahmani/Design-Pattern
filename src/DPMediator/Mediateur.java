package DPMediator;

public interface Mediateur {
	
	// M�thodes permettant les coll�gues
	 public void setCollegueA(collegueA pCollegueA);
	 public void setCollegueB(collegueB pCollegueB);

	 // M�thodes permettant de transmettre des messages
	 public void transmettreMessageFromA(String pMessage);
	 public void transmettreMessageFromB(String pMessage);


}
