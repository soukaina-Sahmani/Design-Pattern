package DPMediator;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Création du médiateur
		 Mediateur lMediateur = new ConcreteMediateur();
		 // Création des collègues
		 collegueA lCollegueA = new collegueA(lMediateur);
		 collegueB lCollegueB = new collegueB(lMediateur);

		 // Déclenchement de méthodes qui demande
		 // au médiateur de transmettre un message
		 lCollegueA.envoyerMessageFromA("Coucou");
		 lCollegueB.envoyerMessageFromB("Salut");


	}

}
