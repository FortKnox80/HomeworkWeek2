package bakery;

//A cake shop that cooks cool and trendy cakes
public class HipsterCakeShop extends CakeShop {
	
	//Bake the type of cake that was selected from this shop 
	Cake bakeACake(String type) {
		Cake cake = new UnknownCake();

		if (type.toLowerCase().contains("more")) 
		{
			cake = new HipsterSmoresCake();
		} 
		else if (type.toLowerCase().contains("rainbow")) 
		{
			cake = new HipsterRainbowCake();
		} 
		else if (type.toLowerCase().contains("lemon")) 
		{
			cake = new HipsterLemonCake();
		}
		else if (type.toLowerCase().contains("lavender"))
		{
			cake =  new HipsterLavenderCake();
		}
		
		return cake;
	}
	
	//Print out a menu of what is available when the shop is selected
	public String menu() {
		String menu;
		return menu = "You have chosen an trendy cake with complex flavors and a playful mouthfeel. We will create something that will be unique, \nand will be a memorable experience for your guests." + 
							"\nThe cakes that we have are: Lavender, Lemon, Rainbow, and S'mores";
	}
}
