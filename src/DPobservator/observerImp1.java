package DPobservator;

public class observerImp1 implements Observer {

	@Override
	//public void update(observable observable) {
	public void update(int state) {
		
		
		//int state=((ObservableImp)observable).getState();
		double res = state*state+9;
		System.out.println("==========================ObserverIMP1======================");
		System.out.println("Nouvelle mise à jour : state =" +state);
		System.out.println("Résultat de calcul : " + res);
		System.out.println("**************************");
		
	}

}
