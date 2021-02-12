package DPAdapter;

public class Adapter implements Standard  {

	//composition Port� objet
	
	private AnciennImpl ancienne = new AnciennImpl();
	
	@Override
	public void operation(int nb1, int nb2) {
		
		double res = ancienne.calcul((double) nb1, nb2);
		ancienne.print(res);
		
	}

}
/*
 port� class : h�ritage
 public class Adapter extends AnciennImpl implements Standard  {

	
	@Override
	public void operation(int nb1, int nb2) {
		
		double res = this.calcul((double) nb1, nb2);
		super.print(res);
		
	}

}
 
 */
