package DPChaineOfResp;

public class MaillonB extends Maillon {
	
	public boolean operationSpec(int pNombre) {
		 if(pNombre < 2) { 
			 System.out.println("MaillonB : " + pNombre + " : < 2");

		 return true;
		 }
		 return false;
		 }


}
