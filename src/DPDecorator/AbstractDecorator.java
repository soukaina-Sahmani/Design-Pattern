package DPDecorator;

public abstract class AbstractDecorator extends boissons {
	
	protected boissons boissons ;
	
	public AbstractDecorator(boissons boissons) {
		super();
		this.boissons =boissons;
	}

	
	public abstract String getDescriptions() ;
	

	
}
