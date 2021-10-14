/**
 * @(#)Payment.java
 *
 *
 * @author 
 * @version 1.00 2019/7/11
 */


public class Payment {
	private Order order;
	private double amountPaid;
	private static int payNumber=0;
	private StringBuilder paymentId=new StringBuilder();
	private int pIdNumber;
	private static int nextpIdNumber=3001;

    public Payment(double amountPaid,Order order) {
    	this.amountPaid=amountPaid;
    	this.order=order;
    	payNumber++;
		this.pIdNumber=nextpIdNumber;
    	this.paymentId.append('P');
    	this.paymentId.append(this.pIdNumber);   
    	nextpIdNumber++;
    }

		public StringBuilder getPaymentId(){
		return paymentId;
		}
		
     	public double getAmountPaid(){
		return amountPaid;
		}

     	public Order getOrder(){
		return order;
		}
		
		public double getChanges(){
			return amountPaid-order.getGrandTotal();
		}
		
		public static int getPayNumber(){
			return payNumber;
		}

		public void setPayNumber(int payNumber){
    	this.payNumber=payNumber;
		}
		
		public String paymentHeader(){
			return "Payment ID>"+paymentId+"\n==========================================================\nNo      Item       Unit Price   Quantity   Total Price \n";
		}

		
		public String paymentFooter(){
			return "==========================================================\n";
		}
		
		public String toString(){
			String pay="\n"+paymentHeader()+order.toString()+paymentFooter()+String.format("Amount Paid   %29s  %-10.2f  \nAmount of Changes  %24s  %-10.2f\n",":",amountPaid,":",getChanges());
			return pay;
		}
}