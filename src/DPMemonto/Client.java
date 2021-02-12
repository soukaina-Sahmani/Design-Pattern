package DPMemonto;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation du gardien
		 Gardien lGardien = new Gardien();
		 // Cr�ation du cr�ateur
		 Createur lCreateur = new Createur();

		 // Sauvegarde l'�tat (2) dans le "Gardien" par le "Memento"
		 lGardien.ajouterMemento(lCreateur.sauverDansMemento());
		 
		 lCreateur.afficher();
		 // Change l'�tat (2 * 2 = 4)
		 lCreateur.suivant();
		 // Sauvegarde l'�tat (4) dans le "Gardien" par le "Memento"
		 lGardien.ajouterMemento(lCreateur.sauverDansMemento());
		 // Change l'�tat (4 * 4 = 16)
		 lCreateur.suivant();
		 // Sauvegarde l'�tat (16) dans le "Gardien" par le "Memento"
		 lGardien.ajouterMemento(lCreateur.sauverDansMemento());
		 // Affiche l'�tat (16)
		 lCreateur.afficher();
		 // R�cup�re l'�tat (4) de l'index 1 depuis le "Gardien"
		 Createur.Memento lMemento1 = lGardien.getMemento(1);
		 // Restaure l'�tat depuis le "Memento"
		 lCreateur.restaurerDepuisMemento(lMemento1);
		 // Affiche l'�tat (4)
		 lCreateur.afficher();



	}

}
