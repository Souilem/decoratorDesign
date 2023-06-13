package boissons;

import concrectsDecorators.Caramel;
import concrectsDecorators.Chocolat;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boisson b = new Expresso();
		
		System.out.println("*********************");
		System.out.println("Description : "+ b.getDescription());
		System.out.println("Cout : "+ b.cout());
		System.out.println("*********************");
		
		b = new Chocolat(b);
		
		System.out.println("*********************");
		System.out.println("Description : "+ b.getDescription());
		System.out.println("Cout : "+ b.cout());
		System.out.println("*********************");
		
		
		b = new Caramel(b);
		
		System.out.println("*********************");
		System.out.println("Description : "+ b.getDescription());
		System.out.println("Cout : "+ b.cout());
		System.out.println("*********************");
		
	}

}
