package project;

public enum Product {

	CAKE(1,100), TWIX(2,50), MARS(3,30), KITKAT(4,150);

    private int id;
    private int price;

    Product(int id, int price){
        this.id = id;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public int getPrice(){
        return this.price;
    }
    
    public static Product valueOf(int productSelected) {
    	for(Product product: Product.values()) {
    		if(productSelected == product.getId()) {
    			return product;
    		}
    	}
    	return null;
    }
}
