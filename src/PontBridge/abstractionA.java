package PontBridge;

public class abstractionA extends Abstraction{
	
	 public abstractionA(implementation pImplementation) {
		 super(pImplementation);
		 }

		 public void operation() {
		 System.out.println("--> Méthode operation() de AbstractionA");
		 operationImpl1("A");
		 operationImpl2(1);
		 operationImpl1("B");
		 
		 }
}
