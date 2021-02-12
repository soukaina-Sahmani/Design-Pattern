package DPMediator;

public interface Mediateur {
	
	// Méthodes permettant les collègues
	 public void setCollegueA(collegueA pCollegueA);
	 public void setCollegueB(collegueB pCollegueB);

	 // Méthodes permettant de transmettre des messages
	 public void transmettreMessageFromA(String pMessage);
	 public void transmettreMessageFromB(String pMessage);


}
