package bakery;

//Creates an unknown cake shop type if the user select a shop that is not available to avoid returning a null
public class UnknownShop extends CakeShop {

	Cake bakeACake(String type) {
		Cake cake = new UnknownCake();
		return cake;
	}

	public String menu() {
		String menu;
		return menu = "";
	}
}
