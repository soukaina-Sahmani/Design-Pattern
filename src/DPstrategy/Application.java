package DPstrategy;

public class Application {

	public static void main(String[] args) {
		contexte ctx = new contexte();
		ctx.setStrategy(new strategyImp1());
		ctx.appliquerStrategy();
		ctx.setStrategy(new strategyImp2());
		ctx.appliquerStrategy();
		ctx.setStrategy(new strategyImp3());
		ctx.appliquerStrategy();
		

	}

}
