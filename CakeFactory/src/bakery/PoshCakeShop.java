package bakery;

//A cake shop that makes elegant and elaborate cakes
public class PoshCakeShop extends CakeShop {

	//Bake the type of cake that was selected from this shop 
	Cake bakeACake(String type) {
		
		Cake cake = new UnknownCake();

		if (type.toLowerCase().contains("champagne")) 
		{
			cake = new PoshChampagneCake();
		} 
		else if (type.toLowerCase().contains("marzipan")) 
		{
			cake = new PoshMarzipanCake();
		} 
		else if (type.toLowerCase().contains("rose")) 
		{
			cake = new PoshRoseCake();
		}
		else if (type.toLowerCase().contains("vanilla"))
		{
			cake = new PoshVanillaBeanCake();
		}
		
		return cake;
	}
		//Print out a menu of what is available when the shop is selected
		public String menu(){
		String menu;
		return menu = "You have chosen an elegant style of cake. We will create something beautiful, and show stopping for your event.\n"
				+ "The cakes that we have are: Marzipan, Champagne, Rose, and Madigascaran Vanilla Bean. What type would you like?";
		}
	}

