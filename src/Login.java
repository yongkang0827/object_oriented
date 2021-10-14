/**
 * @(#)Login.java
 *
 *
 * @author 
 * @version 1.00 2019/7/25
 */

public class Login {
	private Employee employee;
	private String password;
	private static int lNumber=0;
    
    public Login(Employee employee,String password) {
    	this.employee=employee;
    	this.password=password;
    	lNumber++;
    }
    
    public String getPassword(){
    	return password;
    }
    

	public int getLNumber(){
		return lNumber;
	}
    
	public void setLNumber(int lNumber){
    	this.lNumber=lNumber;
	}
     
}