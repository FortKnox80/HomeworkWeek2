package bakery;

//An abstract class  that all cake shops utilize
public abstract class CakeShop {
	
	//A method to create a cake based on the type that is ordered
	public Cake orderCake(String type) {
		
		Cake cake;
		
		//Create a cake based on the type ordered
		cake = bakeACake(type);
		
		//If the cake is unknown, do not preform the actions to make a cake
		if (!cake.name.toLowerCase().contains("unknown")) {
		//If the cake is and available type, bake it
		cake.showPreperations();
		cake.bake();
		cake.cool();
		cake.decorate();
		}
		
		return cake;
		
	}
	
	//Allow each shop to show the customer what they have available
	public String menu() {
		String menu = "";
		return menu;
	}
	
	//Create a new cake
	abstract Cake bakeACake(String type);
}
