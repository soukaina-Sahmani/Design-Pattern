package DPobservator;

public class observerImp2 implements Observer {
  private int counter;
	@Override
	//public void update(observable observable) {
		
		public void update(int state) {
		
		//int state=((ObservableImp)observable).getState();
		if(state%2==0) ++counter;
		System.out.println("==========================ObserverIMP2======================");
		System.out.println("Nouvelle mise à jour : state =" +state);
		System.out.println("Résultat de calcul : " + ((state%2)==0?"Pair" : "Impaire"));
		System.out.println("Le compteur est  : " +counter);
		System.out.println("**************************");
		
	}

}
