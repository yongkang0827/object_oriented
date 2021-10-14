/**
 * @(#)Order.java
 *
 *
 * @author 
 * @version 1.00 2019/6/23
 */


public class Order {
	private OrderLines[] orderLines;
	private int type;
 //	private static int oNumber=0;

    public Order(OrderLines[] orderLines,int type) {
    	this.orderLines=orderLines;
    	this.type=type;
    }
    
    public OrderLines getOrderLines(int i) {
        return orderLines[i];
    }

	public  int getType(){
		return type;
	}

    
    public void setOrder(Order[] order,int type){
    	this.orderLines[type]=orderLines[type];
    }
    
 public  double getGrandTotal(){
   	double grandTotal=0.00;
   	for(OrderLines orderLine:orderLines){
   		grandTotal+=orderLine.getTotalPrice();
   	}
   	return grandTotal;
   }
   
/*   public static void printOrder(){
   	for(OrderLines orderLine:orderLines){
			System.out.print(orderLines.toString()+"\n");
   	}
   	   }*/
       
    public String toString(){
    	String orderDetails="";
		for(int i=0;i<orderLines.length;i++){
			orderDetails+=String.format("%-7d",(i+1))+""+orderLines[i];
		}
		return orderDetails;
}
}
