package DPDecorator;

public class Test {

	public static void main(String[] args) {
		
		boissons b = new Espresso();
		System.out.println("*************************************");
		System.out.println(b.getDescriptions());
		System.out.println(b.cout());
		System.out.println("*************************************");
		b = new chocolat(b);
		System.out.println("*************************************");
		System.out.println(b.getDescriptions());
		System.out.println(b.cout());
		System.out.println("*************************************");
		b = new caramel(b);
		System.out.println("*************************************");
		System.out.println(b.getDescriptions());
		System.out.println(b.cout());
		System.out.println("*************************************");
		b = new chocolat(b);
		System.out.println("*************************************");
		System.out.println(b.getDescriptions());
		System.out.println(b.cout());
		System.out.println("*************************************");b = new chocolat(b);
		System.out.println("*************************************");
		System.out.println(b.getDescriptions());
		System.out.println(b.cout());
		System.out.println("*************************************");b = new chocolat(b);
		System.out.println("*************************************");
		System.out.println(b.getDescriptions());
		System.out.println(b.cout());
		System.out.println("*************************************");
		

	}

}
