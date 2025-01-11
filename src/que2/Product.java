package que2;

public class Product implements Taxable {
   
	private int p_id;

	private double price;
    private int quantity;
    public Product(int p_id, double price, int quantity) 
    {
		this.p_id = p_id;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public double cal_Tax() {
		// TODO Auto-generated method stub
		return price * quantity * Income_Tax;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Product ID: " + p_id + ", Price: " + price + ", Quantity: " + quantity;
	}
    
    

}
