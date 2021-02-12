package DPDecorator;

public class caramel extends AbstractDecorator {

	public caramel(DPDecorator.boissons boissons) {
		super(boissons);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		
		return 0.9+boissons.cout();
	}

	@Override
	public String getDescriptions() {
		
		return  boissons.getDescriptions() + " Au caramel";
	}

}
