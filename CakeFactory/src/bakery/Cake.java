package bakery;

//An abstract class  that all cakes utilize
public abstract class Cake {
	String name;
	
	String filling;
	String fondant;
	String spongeCakeType;
	String icing;
	
	//Show how the cake is being prepared
	void showPreperations() {
		System.out.println("We are going to make you a lovely "+name);
		System.out.println("Turn the mixer onto medium.");
		System.out.println("Preheat the ovens.");
		System.out.println("Get the mixing bowls ready for the icing.");
		}
	
	//A method to bake the cakes
	void bake() {
		System.out.println("The ovens are preheated to 350 degrees farenheit. Bake for 50 minutes.");
	}
	
	//A method to cool the cakes
	void cool() {
		System.out.println("These cakes have to cool for at least an hour before we can frost them. Don't want the frosting to melt!");
	}
	
	//A method to decorate the cakes
	void decorate() {
		System.out.println("Let's make them look pretty. Just to your specifications.");
	}
	
	//Return the name of the cake created
	public String getName() {
		return name;
	}

}
