package bakery;

//A cake for any unknown order types to avoid returning a null
public class UnknownCake extends Cake {
	
	public UnknownCake() {
		
		name = "Unknown cake type.";
		
		filling = "";
		fondant = "";
		icing = ""; 
		spongeCakeType = "";
		
	}
	

}
