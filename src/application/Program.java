package application;

import model.entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		String n1 = "Test";
		String n2 = "Test";
		String n3 = new String("Test");
		String n4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(n1 == n2);
		System.out.println(n3 == n4);
		
	}

}
