/**
 * @(#)TotalSalesReport.java
 *
 *
 * @author 
 * @version 1.00 2019/8/8
 */


public class TotalSalesReport extends Report{
	private static double revenue;

    public TotalSalesReport(Payment[] payment) {
    super(payment);
    }
    
    public static double getRevenue(Payment[] payment){
 		for(int i=0;i<payment[0].getPayNumber();i++)
    	revenue+=payment[i].getOrder().getGrandTotal();
    	return revenue;
    }
    
    public String toString(){
    	return super.reportHeader()+super.toString()+"Total Revenue : "+getRevenue(getPayment());
    }
}