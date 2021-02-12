package PontBridge;

public class abstractionB extends Abstraction{
	
	 public abstractionB(implementation pImplementation) {
		 super(pImplementation);
		 }

		 public void operation() {
			 System.out.println("--> Méthode operation() de AbstractionB");
			 operationImpl2(9);
			 operationImpl2(8);
			 operationImpl1("Z");;
		 
		 }
}
