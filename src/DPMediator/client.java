package DPMediator;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation du m�diateur
		 Mediateur lMediateur = new ConcreteMediateur();
		 // Cr�ation des coll�gues
		 collegueA lCollegueA = new collegueA(lMediateur);
		 collegueB lCollegueB = new collegueB(lMediateur);

		 // D�clenchement de m�thodes qui demande
		 // au m�diateur de transmettre un message
		 lCollegueA.envoyerMessageFromA("Coucou");
		 lCollegueB.envoyerMessageFromB("Salut");


	}

}
