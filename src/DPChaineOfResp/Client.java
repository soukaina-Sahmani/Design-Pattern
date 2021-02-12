package DPChaineOfResp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation des maillons
		 Maillon lMaillonA = new MaillonA();
		 Maillon lMaillonB = new MaillonB();
		 Maillon lMaillonC = new MaillonC();

		 // D�finition de l'enchainement des maillons
		 lMaillonA.setSuivant(lMaillonB);
		 lMaillonB.setSuivant(lMaillonC);

		 // Appel de la m�thode du premier maillon
		 // avec des valeurs diff�rentes
		 System.out.println("--> Appel de la m�thode avec param�tre '1' : ");
		 lMaillonA.operation(1);
		 System.out.println("--> Appel de la m�thode avec param�tre '2' : ");
		 lMaillonA.operation(2);
		 System.out.println("--> Appel de la m�thode avec param�tre '3' : ");
		 lMaillonA.operation(3);
		 System.out.println("--> Appel de la m�thode avec param�tre '4' : ");
		 lMaillonA.operation(4);


	}

}
