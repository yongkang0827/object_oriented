/**
 * @(#)Product.java
 *
 *
 * @author 
 * @version 1.00 2019/7/11
 */

public class Product {
	private String productName;
	private int serial;
	private static int nextSerial=1;
	private double price;
	private static int pNumber=0;

    public Product(String productName,double price) {
    	this.productName=productName;
    	this.price=price;
    	this.serial=nextSerial++;
    	pNumber++;
    }
    
	public String getProductName(){
		return productName;
	}
	
	public int getSerial(){
		return serial;
	}
	
	public double getPrice(){
		return price;
	}

	public int getPNumber(){
		return pNumber;
	}

	public void setProductName(String productName){
    	this.productName=productName;
	}

	public void setSerial(int serial){
    	this.serial=serial;
	}

	public void setPrice(double price){
    	this.price=price;
	}
	
	public void setPNumber(int pNumber){
    	this.pNumber=pNumber;
	}


	


}