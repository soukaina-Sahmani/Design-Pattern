package DPMediator;

public abstract class collegue {
	
	protected Mediateur mediateur;

	 /**
	* Constructeur permettant de fixer le m�diateur
	* @param pMediateur
	*/
	 public collegue(Mediateur pMediateur) {
	 mediateur = pMediateur;
	 }

	 public abstract void recevoirMessage(String pMessage);


}
