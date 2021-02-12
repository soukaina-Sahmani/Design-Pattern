package DPInterpreter;

public class CLIENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cr�ation des expressions non terminales
		 ExpressionNonTerminale lRacine =new ExpressionNonTerminale("RACINE");
		 
		 ExpressionNonTerminale lElement1 = new ExpressionNonTerminale("ELEMENT1");
		
		 ExpressionNonTerminale lElement2 = new ExpressionNonTerminale("ELEMENT2");
		
		 ExpressionNonTerminale lElement3 = new ExpressionNonTerminale("ELEMENT3");
		

		 // Cr�ation des expressions terminales
		 ExpressionTerminal lTexte1 = new ExpressionTerminal("TEXTE1");

		 ExpressionTerminal lTexte2 =new ExpressionTerminal("TEXTE2");
		 
		 // Construit l'arborescence
		 
		 lRacine.ajouterExpression(lElement1);
		 lRacine.ajouterExpression(lElement2);
		 lElement2.ajouterExpression(lElement3);
		 lElement1.ajouterExpression(lTexte1);
		 lElement3.ajouterExpression(lTexte2);

		 // Appel la m�thode de l'expression racine
		 lRacine.operation();

	}

}
