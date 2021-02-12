package DPDecorator;

public class chocolat extends AbstractDecorator {

	public chocolat(DPDecorator.boissons boissons) {
		super(boissons);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return 0.6+boissons.cout();
	}

	@Override
	public String getDescriptions() {
		
		return  boissons.getDescriptions() + " Au chocolat";
	}

}
