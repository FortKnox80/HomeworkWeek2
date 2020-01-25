package bakery;

import java.util.Scanner;

public class OrderACake {
	
	//Allow the user to select a cake based on the shop they chose. If the cake is not offered allow for another selection.
	public static Cake getCakeType(CakeShop shop) {
		
		Scanner userInput = new Scanner(System.in);
		Cake cake;
		String cakeType;

		while (true) {
			
			cakeType = userInput.nextLine();
			cake = shop.orderCake(cakeType);
			
			if (!cake.fondant.equalsIgnoreCase("")) {
				
				System.out.println("You have ordered a " + cake.getName()+ " with a " + cake.spongeCakeType + " "  + cake.filling + "\n"   + cake.icing + " and finished off with "
						+ cake.fondant);
				break;

			} else {
				System.out.println("I'm sorry, we do not carry that item on our menu. Please make another selection.");
			}

		}
		return cake;
	}

	//Allow the user to select a cake shop appropriate for the occasion. If they chose a shop not available allow for another selection.
	public static CakeShop getShopType() {
		Scanner userInput = new Scanner(System.in);
		CakeShop cakeShop = new UnknownShop();
		String shopType;

		while (true) {
			shopType = userInput.nextLine();
			if (shopType.toLowerCase().contains("elegant")) {
				cakeShop = new PoshCakeShop();
				System.out.println(cakeShop.menu());
				break;

			} else if (shopType.toLowerCase().contains("trendy")) {
				cakeShop = new HipsterCakeShop();
				System.out.println(cakeShop.menu());
				break;

			} else {
				System.out.println(
						"I'm sorry. It seems I didn't catch that. Are you looking for something trendy or elegant?");
			}
		}
		return cakeShop;
	}

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		//Welcome the guest to the services
		System.out.println("Thank you for choosing us to help you find your perfect cake. To start off, are you looking for something more elegant or trendy?");

		//Let them pick a shop to order from
		CakeShop shop = getShopType();

		//Let them pick their cake type
		getCakeType(shop);

		
	}
}
