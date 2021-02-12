package PontBridge;

public class Main {

	public static void main(String[] args) {
		// Cr�ation des impl�mentations
		 implementation lImplementationA = new implementationA();
		 implementation lImplementationB = new implementationB();

		 // Cr�ation des abstractions
		 Abstraction lAbstractionAA = new abstractionA(lImplementationA);
		 Abstraction lAbstractionAB = new abstractionA(lImplementationB);
		 Abstraction lAbstractionBA = new abstractionB(lImplementationA);
		 Abstraction lAbstractionBB = new abstractionB(lImplementationB);

		 // Appels des m�thodes des abstractions
		 lAbstractionAA.operation();
		 lAbstractionAB.operation();
		 lAbstractionBA.operation();
		 lAbstractionBB.operation();

	}

}
