package DPstrategy;

public class contexte {
	protected Strategy strategy ;
	
	//valeur au d�but par d�faut
	public contexte()
	{
		strategy = new strategyImp1();
	}
	public void appliquerStrategy()
	{
		strategy.operationStrategy();
	}

	
	//permet de modifier le strategy
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	
}
