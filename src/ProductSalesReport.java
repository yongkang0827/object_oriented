/**
 * @(#)ProductSalesReport.java
 *
 *
 * @author 
 * @version 1.00 2019/8/8
 */


public class ProductSalesReport  extends Report{
	private Product[] product;
 	private int[] totalQuantity;
   
    public ProductSalesReport(Payment[] payment,Product[] product) {
    	super(payment);
    	this.product=product;
    }
    
    public  int[] getTotalQuantity(Payment[] payment){
 	int[] totalQuantity=new int[product[0].getPNumber()];
 		for(int i=0;i<payment[0].getPayNumber();i++){
 		for(int k=0;k<payment[i].getOrder().getType();k++){
 		for(int j=0;j<product[0].getPNumber();j++){
    	if(payment[i].getOrder().getOrderLines(k).getProduct().getSerial()==product[j].getSerial())
    		totalQuantity[j]+=payment[i].getOrder().getOrderLines(k).getQuantity();
 			}}}
    	return totalQuantity;
    }
    

}
