package de.birkhahn.swt;

public class Main {
	public static void main(String[] args) {
		GuitarOrder eguitar = new GuitarOrder(1, "E-Guitar")
							.model("Single Cut")
							.brand("Gibson")
							.color("Black")
							.countOfPickups(2)
							.caseIncluded()
							.payWithCard();
		
		GuitarOrder accoustic = new GuitarOrder(2, "Accoustic Guitar")
								.model("Dreadnought Guitar western")
								.brand("Martin")
								.color("Spruce tree")
								.payWithCash();
		System.out.println(eguitar);
		System.out.println(accoustic);
	}
}
