package project;
import java.util.Scanner;

public class main {

public static void main(String[] args) {
	
   Scanner scanner = new Scanner(System.in);
   VendingMachine vendingMachine = new TextBasedVendingMachine();
   vendingMachine.displayProducts();
   String selectedProduct = scanner.nextLine();
   int selectedProductNumber = Integer.parseInt(selectedProduct);
   vendingMachine.selectedProduct(selectedProductNumber);
   vendingMachine.displayEnterCoinsMessage();
   String userEnterCoins = scanner.nextLine();
   int [] enteresCoins = Coin.parseCoins(userEnterCoins);
   vendingMachine.enterCoins(enteresCoins);
   vendingMachine.displayChangeMessage();
}

}
