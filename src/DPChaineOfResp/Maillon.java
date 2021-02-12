package DPChaineOfResp;

public abstract class Maillon {
	
	private Maillon suivant;

	 public void setSuivant(Maillon pSuivant) {
	 suivant = pSuivant;
	 }

	 public boolean operation(int pNombre) {
	 if(operationSpec(pNombre)) {
	 return true;
	 };

	 if(suivant != null) {
	 return suivant.operation(pNombre);
	 }
	 return false;
	 }
	 
	 
	 public abstract boolean operationSpec(int pNombre);


}
