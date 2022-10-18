package project;

public interface VendingMachine {
	
void displayProducts();
void selectedProduct(int product);
void displayEnterCoinsMessage();
void enterCoins(int... coins);
void displayChangeMessage();

}
