package DPDecorator;

public class vanille extends AbstractDecorator {

	public vanille(DPDecorator.boissons boissons) {
		super(boissons);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return 0.7+boissons.cout();
	}

	@Override
	public String getDescriptions() {
		
		return  boissons.getDescriptions() + " Au vanille";
	}

}
