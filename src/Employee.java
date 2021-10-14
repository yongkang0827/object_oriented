/**
 * @(#)Employee.java
 *
 *
 * @author 
 * @version 1.00 2019/7/11
 */

public class Employee {
	private String employeeName;
	private StringBuilder id=new StringBuilder();
	private String position;
	private int mIdNumber;
	private static int nextMIdNumber=1001;
	private int sIdNumber;
	private static int nextSIdNumber=2001;
	private static int eNumber=0;

    public Employee(String employeeName,String position) {
    	this.employeeName=employeeName;
        this.position=position;
    	if(position.equalsIgnoreCase("manager")){
		this.mIdNumber=nextMIdNumber;
    	this.id.append('M');
    	this.id.append(this.mIdNumber);   
    	nextMIdNumber++;
    	}
    	else if(position.equalsIgnoreCase("staff")){
		this.sIdNumber=nextSIdNumber;
    	this.id.append("S");
    	this.id.append(this.sIdNumber);   
    	nextSIdNumber++; 		
    	}    	eNumber++;
    }
    
	public String getEmployeeName(){
		return employeeName;
	}
	
	public static int getENumber(){
		return eNumber;
	}
	
	public StringBuilder getId(){
		return id;
	}
    
	public String getPosition(){
		return position;
	}
    public void setId(StringBuilder id){
    	this.id=id;
	}

    public void setPosition(String position){
    	this.position=position;
	}
	
    public void setEmployeeName(String employeeName){
    	this.employeeName=employeeName;
	}
	
	public void setENumber(int eNumber){
    	this.eNumber=eNumber;
	}

}
