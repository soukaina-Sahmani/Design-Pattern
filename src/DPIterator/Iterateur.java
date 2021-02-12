package DPIterator;

public interface Iterateur {
	/**
	* Retourne l'élément suivant
	*/
	 public String suivant();

	 /**
	* Retourne si l'itérateur
	* est arrivé sur le dernier élément
	*/
	 public boolean fini();

}
