/**
 * @(#)Report.java
 *
 *
 * @author 
 * @version 1.00 2019/7/11
 */


public class Report {
	private Payment[] payment;
   
    public Report(Payment[] payment) {
    	this.payment=payment;
    }
    
        public Payment[] getPayment(){
		return payment;
		}

		public void setPayment(Payment[] payment){
    	this.payment=payment;
		}
		
		public String reportHeader(){
			return "\nTotal Sales Report\n======================";
		}

	    public String toString(){
	    String rpt="";
 		for(int i=0;i<payment[0].getPayNumber();i++){
		   	rpt+=payment[i].toString()+"\n";
 		}
 		return rpt;
    }

}