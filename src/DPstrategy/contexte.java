package DPstrategy;

public class contexte {
	protected Strategy strategy ;
	
	//valeur au début par défaut
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
