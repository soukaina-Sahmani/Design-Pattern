package DPChaineOfResp;

public class MaillonA extends Maillon {
	
	public boolean operationSpec(int pNombre) {
		 if(pNombre % 2 == 0) {
		 System.out.println("MaillonA : " + pNombre + " : pair");
		 return true;
		 }
		 return false;
		 }


}
