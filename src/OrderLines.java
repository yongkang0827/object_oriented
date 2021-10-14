/**
 * @(#)OrderLines.java
 *
 *
 * @author 
 * @version 1.00 2019/7/26
 */


public class OrderLines {
 	private int quantity;
 	private Product product;
 	private int no;
 	private static int nextNo=1;
 	
 	public OrderLines(int quantity,Product product){
 		this.quantity=quantity; 		
 		this.product=product;
 		this.no=nextNo;
 		nextNo++;
 	}
 	
        public int getQuantity(){
		return quantity;
		}
		
		public double getTotalPrice(){
		return product.getPrice()*quantity;
		}

        public Product getProduct(){
		return product;
		}

		public void setQuantity(int quantity){
 		this.quantity=quantity;
		}
		
		public String toString(){
			return String.format("%-12s %-14.2f %-9d %-5.2f\n",product.getProductName(),product.getPrice(),quantity,getTotalPrice());
		}
 		}