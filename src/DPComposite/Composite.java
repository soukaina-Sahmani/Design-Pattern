package DPComposite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class Composite extends Composant {
	
	// Liste d'objets "Composant" de l'objet "Composite"
	 private List<Composant> liste = new LinkedList<Composant>();

	 public Composite(final String pNom) {
		 super(pNom);
	 }
	 
	 /**
	 * M�thode commune � tous les composants :
	 * Affiche qu'il s'agit d'un objet "Composite"
	 * ainsi que le nom qu'on lui a donn�,
	 * puis appelle la m�thode "operation()"
	 * de tous les composants de cet objet.
	 */
	  public void operation() {
	  System.out.println("Op. sur un 'Composite' (" + nom + ")");
	  final Iterator<Composant> lIterator = liste.iterator();
	  while(lIterator.hasNext()) {
	  final Composant lComposant = lIterator.next();
	  lComposant.operation();

	  }
	  }
	  /**
	 * Retourne la liste d'objets "Composant"
	 * @return La liste d'objets "Composant"
	 */
	  public List<Composant> getEnfants() {
	  return liste;
	  }

	  /**
	 * Ajoute un objet "Composant" au "Composite"
	 * @param pComposant
	 */
	  public void ajouter(final Composant pComposant) {
	  liste.add(pComposant);
	  }

	  /**
	 * Retire un objet "Composant"
	 * @param pComposant
	 */
	  public void retirer(final Composant pComposant) {
		  liste.remove(pComposant);
		  }

}
