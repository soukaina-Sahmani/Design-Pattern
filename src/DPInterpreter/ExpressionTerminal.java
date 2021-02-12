package DPInterpreter;

public class ExpressionTerminal extends Expression {

	private String texte;
	 /**
	* Constructeur permettant de fixer un attribut texte
	* @param pTexte
	*/
	 public ExpressionTerminal(String pTexte) {
		 
		 texte = pTexte;
		 }

		 /**
		* Affiche l'attribut texte avec indentation
		*/
		 public void operation(int pIndentation) 
		 {
		 afficherIndentation(pIndentation);
		 
		 System.out.println(texte);
		 
		 }
	 }

