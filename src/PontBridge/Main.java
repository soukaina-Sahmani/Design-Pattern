package PontBridge;

public class Main {

	public static void main(String[] args) {
		// Création des implémentations
		 implementation lImplementationA = new implementationA();
		 implementation lImplementationB = new implementationB();

		 // Création des abstractions
		 Abstraction lAbstractionAA = new abstractionA(lImplementationA);
		 Abstraction lAbstractionAB = new abstractionA(lImplementationB);
		 Abstraction lAbstractionBA = new abstractionB(lImplementationA);
		 Abstraction lAbstractionBB = new abstractionB(lImplementationB);

		 // Appels des méthodes des abstractions
		 lAbstractionAA.operation();
		 lAbstractionAB.operation();
		 lAbstractionBA.operation();
		 lAbstractionBB.operation();

	}

}
