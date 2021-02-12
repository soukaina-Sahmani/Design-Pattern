package DPobservator;

public class test {

	public static void main(String[] args) {
		ObservableImp observable = new ObservableImp();
		Observer o1 = new observerImp1();
		Observer o2 = new observerImp2();
		Observer o3 = new observerImp1();
		
		observable.subscribe(o1);
		observable.subscribe(o2);
		
	/*	observable.subscribe(new Observer() {
			
			@Override
			public void update(observable observable) {
				
				System.out.println("observateur anonyme");
				
			}
		});*/
		
		observable.subscribe(obs-> {
			System.out.println("===========================");
			
		});
		observable.subscribe(o3);
		
		observable.setState(60);
		observable.setState(60);
		observable.unsubscribe(o2);
		observable.setState(20);

	}

}
