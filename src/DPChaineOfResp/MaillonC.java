package DPChaineOfResp;

public class MaillonC extends Maillon {
	
	public boolean operationSpec(int pNombre) {
		if(pNombre > 2) {
			 System.out.println("MaillonC : " + pNombre + " : > 2");
		 return true;
		 }
		 return false;
		 }


}
