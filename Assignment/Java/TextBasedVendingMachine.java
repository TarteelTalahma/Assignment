package project;

public class TextBasedVendingMachine implements VendingMachine{
  
	private int selectedProducts;
	private CoinBundle change;
	
	@Override
	public void displayProducts() {
		System.out.println("Products available in vending machine");
		for(Product product: Product.values()) {
			System.out.println(product.getId()+" "+ product.name()+" -price: "+ product.getPrice() );
		}
		System.out.println("Please select your product: ");
		}

	
	@Override
	public void selectedProduct(int product) {
		this.selectedProducts = product;
	}

	@Override
	public void displayEnterCoinsMessage() {	
		 System.out.println(" Please enter coins as follows: ");
	     System.out.println(" 5 cents, 10 cents, 20 cents, 50 cents, 100 cents");
	     System.out.println(" If you would like to enter 100  cents : 0,0,0,0,1");
	     System.out.println(" Plese enter coins:");
	}

	@Override
	public void enterCoins(int... coins) {
		Calculater calculater = new SimpleCalculater(); 
		Product product = Product.valueOf(this.selectedProducts);
		int total = calculater.calculatedTotal(new CoinBundle(coins));
		int changeAmount = total - product.getPrice();
		this.change = calculater.calculateChange(changeAmount);
		
	}

	@Override
	public void displayChangeMessage() {	
        System.out.println("Your change is :" + change.getTotal() + " cents splitted as follows: ");
        System.out.println("100 c: "+ change.number100CentsCoins);
        System.out.println("50 c: "+ change.number50CentsCoins);
        System.out.println("20 c: "+ change.number20CentsCoins);
        System.out.println("10 c: "+ change.number10CentsCoins);
	}

}
