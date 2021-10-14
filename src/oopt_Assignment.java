/**
 * @(#)oopt_Assignment.java
 *
 * oopt_Assignment application
 *
 * @author 
 * @version 1.00 2019/6/23
 */
 import java.util.Scanner;
import java.util.InputMismatchException;
public class oopt_Assignment {
    
    public static void main(String[] args) {
  	    Product[] product=new Product[50];
     	Employee[] employee=new Employee[30];
 	    Payment[] payment=new Payment[100];
    	Scanner scan=new Scanner(System.in);
    	Login[] login=new Login[30];
		ProductSalesReport productSalesReport=new ProductSalesReport(payment,product);
		TotalSalesReport totalSalesReport=new TotalSalesReport(payment);
		initialize(product,employee,login);
/*    	product[0]=new Product("Monitor",350);
    	product[1]=new Product("Keyboard",30);
    	product[2]=new Product("Mouse",30);
    	product[3]=new Product("Printer",150);
    	product[4]=new Product("Adapter",50);
    	product[5]=new Product("Speaker",100);
    	product[6]=new Product("RAM",150);
    	Employee[] employee=new Employee[30];
    	employee[0]=new Employee("Kang","Manager");
    	employee[1]=new Employee("James","Manager");
    	employee[2]=new Employee("Irene","Staff");
    	employee[3]=new Employee("Yoona","Staff");
    	employee[4]=new Employee("Annie","Staff");
    	employee[5]=new Employee("Joy","Staff");
    	Scanner scan=new Scanner(System.in);
    	Login[] login=new Login[30];
    	login[0]=new Login(employee[0],"a123456789");
    	login[1]=new Login(employee[1],"b123456789");
    	login[2]=new Login(employee[2],"c123456789");
    	login[3]=new Login(employee[3],"d123456789");
    	login[4]=new Login(employee[4],"e123456789");
    	login[5]=new Login(employee[5],"f123456789"); 
   		Payment[] payment=new Payment[100];*/
//    	printProduct(product);		
 //   	printEmployee(employee);		
	   	work(employee,login,product,payment,productSalesReport,totalSalesReport);
//		addProduct(product);
//		searchProduct(product);
//		searchEmployee(employee);
//		addEmployee(employee,login);
//		updateProduct(product);
//		updateEmployee(employee);
//		makeOrder(product,payment);
//		searchPayment(payment);
//		refund(payment);	
//		System.out.println(totalSalesReport);
//		printProductReport(product,payment,productSalesReport);
//		deleteProduct(product);
//		deleteEmployee(employee);
//		System.out.print(checkLogin("s2004","f153456789",employee,login));
  }
  
  public static void initialize(Product[] product,Employee[] employee,Login[] login){
	  	product[0]=new Product("Monitor",350);
    	product[1]=new Product("Keyboard",30);
    	product[2]=new Product("Mouse",30);
    	product[3]=new Product("Printer",150);
    	product[4]=new Product("Adapter",50);
    	product[5]=new Product("Speaker",100);
    	product[6]=new Product("RAM",150);
    	employee[0]=new Employee("Kang","Manager");
    	employee[1]=new Employee("James","Manager");
    	employee[2]=new Employee("Irene","Staff");
    	employee[3]=new Employee("Yoona","Staff");
    	employee[4]=new Employee("Annie","Staff");
    	employee[5]=new Employee("Joy","Staff");
    	login[0]=new Login(employee[0],"a123456789");
    	login[1]=new Login(employee[1],"b123456789");
    	login[2]=new Login(employee[2],"c123456789");
    	login[3]=new Login(employee[3],"d123456789");
    	login[4]=new Login(employee[4],"e123456789");
    	login[5]=new Login(employee[5],"f123456789"); 
  }
   
	public static void printProduct(Product[] product){
		System.out.print("\nSERIAL NO     PRODUCT NAME         PRICE (RM) ");
		System.out.print("\n=================================================\n");
		for(int j=0;j<product[0].getPNumber();j++){
			System.out.printf("    %-11d %-20s %-6.2f\n",product[j].getSerial(),product[j].getProductName().toUpperCase(),product[j].getPrice());
		}
		System.out.print("\n");
	}
	
	   	public static void addProduct(Product[] product){
   		char select;
   		printProduct(product);
   	    Scanner scan=new Scanner(System.in);
   	    do{
 		try {
   	    System.out.print("Add Product");
   	    System.out.println("\n==================");
		System.out.print("Enter the product name : ");
		String name=scan.nextLine();
		System.out.print("Enter the product price : ");
		double price=scan.nextDouble();
		do{
		if(price<1){
			System.out.println("The price enter cannot less than 1\nPlease Try Again!!!!");
		System.out.print("Enter the product price : ");
		price=scan.nextDouble();
				}
		}while(price<1);
		product[product[0].getPNumber()]=new Product(name,price);
    	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
				catch (ArithmeticException arithmeticException) {
				System.err.println("Number enter cant be zero, please try again");
				scan.nextLine();}
  		printProduct(product);
		System.out.print("Continue to add product ? (Y for yes N for no) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
		scan.nextLine();
    	}while(select=='Y');
	}

	public static void searchProduct(Product[] product){
   		char select;
   		int number;
   	    Scanner scan=new Scanner(System.in);
   	    do{
    	int checkNo=0;
		try {
   	    System.out.print("Search Product");
   	    System.out.println("\n==================");
 		System.out.print("Enter the serial number of product for searching : ");
 		number=scan.nextInt();
  		do{
		for(int j=0;j<product[0].getPNumber();j++){
			if(number==product[j].getSerial()){
			checkNo++;
		}
		}
		if(checkNo==0){
		System.out.println("Invalid!\nNo such product serial number");
 	    System.out.print("Enter the serial no of the product : ");
		number=scan.nextInt();
			}
		else {
			System.out.println("Product Name : "+product[number].getProductName());
			System.out.printf("Product price : %-5.2f\n",product[number].getPrice());
		}
 		}while(checkNo==0);
 		} catch (InputMismatchException inputMismatchException) {
		System.err.println("Please input number only, please try again");
		scan.nextLine();}		
		System.out.print("\nContinue to search product ? (Y for yes N for no) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
		scan.nextLine();
    	}while(select=='Y');	}
	
	public static void deleteProduct(Product[] product){
   		char select;
   		int number;
   		printProduct(product);
   	    Scanner scan=new Scanner(System.in);
   	    do{
    	int checkNo=0;
		try {
   	    System.out.print("Delete Product");
   	    System.out.println("\n==================");
 		System.out.print("Enter the number of product want to delete : ");
 		number=scan.nextInt();
  		do{
		for(int j=0;j<product[0].getPNumber();j++){
			if(number==product[j].getSerial()){
			checkNo++;
		for(int i=number;i<product[0].getPNumber();i++){
			product[i-1]=product[i];
			product[i-1].setSerial(i);
			}
		}
		}
		if(checkNo==0){
		System.out.println("Invalid!\nEnter only the number in the list");
 	    System.out.print("Enter the serial no of the product : ");
		number=scan.nextInt();
			}
		else product[0].setPNumber(product[0].getPNumber()-1);
 		}while(checkNo==0);
 		} catch (InputMismatchException inputMismatchException) {
		System.err.println("Please input number only, please try again");
		scan.nextLine();}		
  		printProduct(product);
		System.out.print("Continue to delete product ? (Y for yes N for no) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
		scan.nextLine();
    	}while(select=='Y');
 	}	
	
		public static void updateProduct(Product[] product){
	   	char select;
		String name="";
		double price=0;
		printProduct(product);
   	    Scanner scan=new Scanner(System.in);
   	    System.out.print("Update Product");
   	    System.out.println("\n==================");
    	do{
    	int checkNo=0;
 		try {
 	    System.out.print("Enter the serial no of the product : ");
		int no=scan.nextInt();
		do{
		for(int i=0;i<product[0].getPNumber();i++){
			if(no==product[i].getSerial()){
		checkNo++;
		System.out.print("Update \n1 . Name\n2. Price\n3. Both (Enter only 1 or 2 or 3) :");
		int choice=scan.nextInt();
		if(choice==1){
			System.out.print("Enter the product name : ");
			scan.nextLine();
			name=scan.nextLine();
			product[i].setProductName(name);
		}
		else if(choice==2){
		System.out.print("Enter the product price : ");
		price=scan.nextDouble();
		do{
		if(price<1){
			System.out.println("The price enter cannot below 1\nPlease Try Again!!!!");
		System.out.print("Enter the product price : ");
		price=scan.nextDouble();
				}
		}while(price<1);
		product[i].setPrice(price);
		}
		else if(choice==3){
			System.out.print("Enter the product name : ");
			scan.nextLine();
			name=scan.nextLine();
			System.out.print("Enter the product price : ");
			price=scan.nextDouble();
					do{
		if(price<1){
		System.out.println("The price enter cannot below 1\nPlease Try Again!!!!");
		System.out.print("Enter the product price : ");
		price=scan.nextDouble();
				}
		}while(price<1);
			product[i].setProductName(name);
			product[i].setPrice(price);
		}
			}
		}
			if(checkNo==0){
		System.out.println("Invalid!\nEnter only the no in the list");
 	    System.out.print("Enter the serial no of the product : ");
		no=scan.nextInt();
			}
 		}while(checkNo==0);		
 			printProduct(product);
    	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
				catch (ArithmeticException arithmeticException) {
				System.err.println("Number enter cant be zero, please try again");
				scan.nextLine();}
		System.out.print("Continue to update product ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
		scan.nextLine();
    	}while(select=='Y');
	}
	
	public static void printEmployee(Employee[] employee){
		System.out.print("\nID       NAME          POSITION ");
		System.out.print("\n===============================\n");
		for(int j=0;j<employee[0].getENumber();j++){
			System.out.printf("%-8s %-13s %s\n",employee[j].getId(),employee[j].getEmployeeName().toUpperCase(),employee[j].getPosition().toUpperCase());
		}
		System.out.print("\n");
	}

   	public static void addEmployee(Employee[] employee,Login[] login){
   		char select;
   		printEmployee(employee);
   	    Scanner scan=new Scanner(System.in);
   	    do{
 		try {
   	    System.out.print("Add Employee");
   	    System.out.println("\n==================");
		System.out.print("Enter the employee name : ");
		String name=scan.nextLine();
		System.out.print("Enter the employee position : ");
		String position=scan.nextLine();
		if(position.toUpperCase().equals("STAFF")==false&&position.toUpperCase().equals("MANAGER")==false){
			do{
		System.out.println("\nInvalid !! \nEnter only Staff or Manager ");
		System.out.print("Enter the employee position : ");
		position=scan.nextLine();
			}while(position.toUpperCase().equals("STAFF")==false&&position.toUpperCase().equals("MANAGER")==false);
		}
		employee[employee[0].getENumber()]=new Employee(name,position);
		addLogin(employee[employee[0].getENumber()],login);
    	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
  		printEmployee(employee);
		System.out.print("Continue to add employee ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
			scan.nextLine();
    	}while(select=='Y');
	}
 	
 	public static void searchEmployee(Employee[] employee){
   		char select;
   		int sequence=0;
   	    Scanner scan=new Scanner(System.in);
   	    do{
   		int checkId=0;
   	    System.out.print("Search Employee");
   	    System.out.println("\n==================");
   	    System.out.print("Enter the ID of the employee for searching: ");
		String iD=scan.nextLine();
  		do{
		StringBuilder ID=new StringBuilder();
		ID.append(iD);
		for(int i=0;i<employee[0].getENumber();i++){
		if(ID.toString().equalsIgnoreCase(employee[i].getId().toString())){
		checkId++;
		sequence=i;
		}
		}
		if(checkId>0){
				System.out.println("Staff Name :"+employee[sequence].getEmployeeName());
				System.out.println("Position :"+employee[sequence].getPosition());
		}
		else{
				System.out.println("Invalid!\nEnter only the id in the list");
			   	System.out.print("Enter the ID of the employee : ");
				iD=scan.nextLine();
		}
 		}while(checkId==0);
		System.out.print("\nContinue to search employee ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
		scan.nextLine();
    	}while(select=='Y'); 	}
 		
	public static void deleteEmployee(Employee[] employee,Login[] login){
   		char select;
   		int sequence=0;
   		printEmployee(employee);
   	    Scanner scan=new Scanner(System.in);
   	    do{
   		int checkId=0;
   	    System.out.print("Delete Employee");
   	    System.out.println("\n==================");
   	    System.out.print("Enter the ID of the employee want to delete: ");
		String iD=scan.nextLine();
  		do{
		StringBuilder ID=new StringBuilder();
		ID.append(iD);
		for(int i=0;i<employee[0].getENumber();i++){
		if(ID.toString().equalsIgnoreCase(employee[i].getId().toString())){
		checkId++;
		sequence=i;
		}
		}
		if(checkId>0){
		for(int j=sequence;j<employee[0].getENumber();j++){
			employee[j]=employee[j+1];
			login[j]=login[j+1];
		}
		employee[0].setENumber(employee[0].getENumber()-1);
		login[0].setLNumber(login[0].getLNumber()-1);
		}
		else{
				System.out.println("Invalid!\nEnter only the id in the list");
			   	System.out.print("Enter the ID of the employee : ");
				iD=scan.nextLine();
		}
 		}while(checkId==0);
   		printEmployee(employee);
		System.out.print("Continue to delete employee ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
		scan.nextLine();
    	}while(select=='Y');
 	}		
  		public static void updateEmployee(Employee[] employee){
		String name="";
		String pst="";
   		char select;
   	    Scanner scan=new Scanner(System.in);
		do{
   		int checkId=0;
 		try {
   		printEmployee(employee);
   	    System.out.print("Update Employee");
   	    System.out.println("\n==================");
   	    System.out.print("Enter the ID of the employee : ");
		String iD=scan.nextLine();
		do{
		StringBuilder ID=new StringBuilder();
		ID.append(iD);
		for(int i=0;i<employee[0].getENumber();i++){
		if(ID.toString().equalsIgnoreCase(employee[i].getId().toString())){
		checkId++;
		if(Character.toUpperCase(ID.charAt(0))=='P'){
			System.out.print("Enter the employee name : ");
			scan.nextLine();
			name=scan.nextLine();		
			employee[i].setEmployeeName(name);
		}
		else{
		System.out.print("Update \n1 . Name\n2. Position\n3. Both (Enter only 1 or 2 or 3) :");
		int choice=scan.nextInt();
		if(choice==1){
			System.out.print("Enter the employee name : ");
			scan.nextLine();
			name=scan.nextLine();
			employee[i].setEmployeeName(name);
		}
		else if(choice==2){
		System.out.print("Enter the employee position : ");
		scan.nextLine();
		pst=scan.nextLine();
		if(pst.toUpperCase().equals("STAFF")==false&&pst.toUpperCase().equals("MANAGER")==false){
			do{
		System.out.println("\nInvalid !! \nEnter only Staff or Manager ");
		System.out.print("Enter the employee position : ");
		pst=scan.nextLine();
		employee[i].setPosition(pst);
			}while(pst.toUpperCase().equals("STAFF")==false&&pst.toUpperCase().equals("MANAGER")==false);
		}

    	if(pst.equalsIgnoreCase("manager"))
			employee[i].getId().setCharAt(0,'M');
    	else if(pst.equalsIgnoreCase("staff"))
			employee[i].getId().setCharAt(0,'S');
		}
		else if(choice==3){
			System.out.print("Enter the employee name : ");
			scan.nextLine();
			name=scan.nextLine();
			System.out.print("Enter the employee position : ");
			pst=scan.nextLine();
		if(pst.toUpperCase().equals("STAFF")==false&&pst.toUpperCase().equals("MANAGER")==false){
			do{
		System.out.println("\nInvalid !! \nEnter only Staff or Manager ");
		System.out.print("Enter the employee position : ");
		pst=scan.nextLine();
			}while(pst.toUpperCase().equals("STAFF")==false&&pst.toUpperCase().equals("MANAGER")==false);
		}

    	if(pst.equalsIgnoreCase("manager"))
			employee[i].getId().setCharAt(0,'M');
    	else if(pst.equalsIgnoreCase("staff"))
			employee[i].getId().setCharAt(0,'S');
			employee[i].setEmployeeName(name);
			employee[i].setPosition(pst);
		}
		else{ System.out.println("\nInvalid!\nEnter only 1,2 or 3");
				System.out.print("Update \n1 . Name\n2. Position\n3. Both (Enter only 1 or 2 or 3) :");
				choice=scan.nextInt();
		}		
			}
			}
		}
			if(checkId==0){
				System.out.println("\nInvalid!\nEnter only the id in the list");
			   	System.out.print("Enter the ID of the employee : ");
				iD=scan.nextLine();

			}
 		}while(checkId==0);
   		printEmployee(employee);
    	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
				catch (ArithmeticException arithmeticException) {
				System.err.println("Number enter cant be zero, please try again");
				scan.nextLine();}
		System.out.print("Continue to update employee ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);
			scan.nextLine();
    	}while(select=='Y');
    		printEmployee(employee);
 	}
			
	public static void makeOrder(Product[] product,Payment[] payment){
		int  no=0,qty=0,pay=payment[0].getPayNumber(),largestValue;
   		char select;
   		double amountPaid;
	   	Scanner scan=new Scanner(System.in);
  	 	do{
 		try {
		printProduct(product);
		System.out.print("How many type of item want to purchase : ");
		int type=scan.nextInt();
		do{
			if(type<1||type>product[0].getPNumber()){
		System.out.println("\nOnly Minimum 1 and Maximum "+product[0].getPNumber()+" type of item can be purchase\nPlease try again!");
		System.out.print("\nHow many type of item want to purchase : ");
		type=scan.nextInt();
			}
		}while(type<1||type>product[0].getPNumber());
		OrderLines[] orderLines=new OrderLines[type];
		for(int i=0;i<type;i++){
		System.out.println("Item "+(i+1));
		System.out.println("==========================");
		System.out.print("Item want to purchase : ");
		no=scan.nextInt();
		if(no>product[0].getPNumber()){
			System.out.println("Invalid !\nEnter only the number in the list");
			System.out.print("Item want to purchase : ");
			no=scan.nextInt();
		}
		System.out.print("Quantity : ");
		qty=scan.nextInt();
		do{
		if(qty<1){
		System.out.println("The quantity enter cannot below 1\nPlease Try Again!!!!");
		System.out.print("Quantity : ");
		qty=scan.nextInt();
				}
		}while(qty<1);
		orderLines[i]=new OrderLines(qty,product[no-1]);
		}
		Order order=new Order(orderLines,type);
		printOrder(orderLines,order);
		System.out.print("\nThe amount of payment                      :  ");
		amountPaid=scan.nextDouble();
		do{
			largestValue=(((int)order.getGrandTotal()+99)/100)*100;
			if(amountPaid>largestValue){
			System.out.println("The amount of payment cannot more than "+largestValue+"\nPlease try again");
			System.out.print("\nThe amount of payment                        :  ");
			amountPaid=scan.nextDouble();
			}
		}while(amountPaid>largestValue);
		do{
		if(amountPaid<order.getGrandTotal()){
		System.out.println("The amount of payment is not enough to pay\nPlease try again");
		System.out.print("\nThe amount of payment                        :  ");
		amountPaid=scan.nextDouble();
		}
		}while(amountPaid<order.getGrandTotal());
		payment[Payment.getPayNumber()]=new Payment(amountPaid,order);
		System.out.print("\nPayment ");
		System.out.println(payment[pay]);
		++pay;
    	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
				catch (ArithmeticException arithmeticException) {
				System.err.println("Number enter cant be zero, please try again");
				scan.nextLine();}
	   	System.out.print("Continue to make order ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);    	
		}while(select=='Y');
		Report report=new Report(payment);
//		System.out.println(report.toString());
//		ProductSalesReport productSalesReport=new ProductSalesReport(payment,product);
	}
	
	public  static void printOrder(OrderLines[] orderLines,Order order){
 		System.out.println("\nOrder details");
		System.out.println("==========================================================");
		System.out.println("No      Item       Unit Price   Quantity   Total Price ");
		for(int i=0;i<orderLines.length;i++)
		System.out.print((i+1)+"       "+orderLines[i]);
		System.out.println("==========================================================");
		System.out.printf("%43s:  %.2f","Grand Total",order.getGrandTotal());
		}
		
	public static void searchPayment(Payment[] payment){
   		char select;
   		do{
		Scanner scan=new Scanner(System.in);
   		int checkPayment=0;
   	    System.out.print("Search Payment");
   	    System.out.println("\n==================");
   	    System.out.print("Enter the ID of the payment for searching: ");
		String iD=scan.nextLine();
  		do{
		StringBuilder ID=new StringBuilder();
		ID.append(iD);
		for(int i=0;i<payment[0].getPayNumber();i++){
		if(ID.toString().equalsIgnoreCase(payment[i].getPaymentId().toString())){
		checkPayment++;
		System.out.println(payment[i]);
		}
		}
		if(checkPayment==0){
		System.out.println("Invalid!\nNo Payment Record Found!\nPlease try again");
   	    System.out.print("Enter the ID of the payment want to refund: ");
		iD=scan.nextLine();
		}
 		}while(checkPayment==0);
 			   	System.out.print("Continue to search payment ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);    	
		}while(select=='Y');

 	}	
 					
	public static void refund(Payment[] payment){
		Scanner scan=new Scanner(System.in);
   		int sequence=0;
   		int checkPayment=0;
   	    System.out.print("Refund");
   	    System.out.println("\n==================");
   	    System.out.print("Enter the ID of the payment want to refund: ");
		String iD=scan.nextLine();
  		do{
		StringBuilder ID=new StringBuilder();
		ID.append(iD);
		for(int i=0;i<payment[0].getPayNumber();i++){
		if(ID.toString().equalsIgnoreCase(payment[i].getPaymentId().toString())){
		checkPayment++;
		sequence=i;
		}
		}
		System.out.println("The amount of refund : "+payment[sequence].getOrder().getGrandTotal());
		if(checkPayment>0){
		for(int j=sequence;j<payment[0].getPayNumber();j++){
			payment[j]=payment[j+1];
		}
		payment[0].setPayNumber(payment[0].getPayNumber()-1);
		}
		else{
		System.out.println("Invalid!\nNo Payment Record Found!\nPlease try again");
   	    System.out.print("Enter the ID of the payment want to refund: ");
		iD=scan.nextLine();
		}
 		}while(checkPayment==0);
 	}		
 				
	public static void printProductReport(Product[] product,Payment[] payment,ProductSalesReport productSalesReport){
		int totalQuantity[]=new int[product.length];
		double totalRevenue=0;
 		System.out.println("\nTotal Sales Report Based On Product");
 		System.out.println("Serial No   Product Name   Total Quantity Sold   Revenue Per Unit     Revenue Per Product");
		System.out.println("=========================================================================================");
		for(int i=0;i<product[0].getPNumber();i++){
		totalQuantity[i]=productSalesReport.getTotalQuantity(payment)[i];
		System.out.printf("%-14d%-20s%-19d%-22.2f%-10.2f\n",product[i].getSerial(),product[i].getProductName(),totalQuantity[i],product[i].getPrice(),product[i].getPrice()*totalQuantity[i]);
		totalRevenue+=product[i].getPrice()*totalQuantity[i];
		}
		System.out.printf("                                                          Total Revenue : %-10.2f",totalRevenue);
	}	
		
    public static boolean checkLogin(String id,String pass,Employee[] employee,Login[] login){
    	for(int i=0;i<login[0].getLNumber();i++){
    		if(id.equalsIgnoreCase(employee[i].getId().toString())){
    			if(pass.equals(login[i].getPassword()))
    				return true;
    		}
    	}
    	return false;
    }
    
    public static boolean checkPassword(String password){
    int valid=1;
    int count=0;
    int digit=0;
    int letter=0;
		for(int i=0;i<password.length();i++){
    			if(Character.isLetterOrDigit(password.charAt(i)))
    			{count++;
    			}
    			if(Character.isLetter(password.charAt(i)))
    			{letter++;
    			}
    			if(Character.isDigit(password.charAt(i)))
    			{digit++;
    			}}
    	if(password.length()>=7){
    		if(count==password.length())
    		{
    			if(digit>0){
    				if(letter>0)
    					valid=0;
    			}
    		}
    	}
    	if(valid==0)
    	return true;
    	
    	return false;
    		}
    		

    
    public static void addLogin(Employee employee,Login[] login){
    	String pass;
    	Scanner scan=new Scanner(System.in);
    	System.out.println("\nSet password");
		System.out.println("==========================");
    	System.out.print("Enter your password(it should contain at least 7 characters and  contain at least one letters and digit)    :");
    	pass=scan.nextLine();
    	if(checkPassword(pass)){
		login[login[0].getLNumber()]=new Login(employee,pass);
		System.out.println("Valid Password!!!");
    	System.out.println("Your password have set up successfully");
    	}
		else{ 
		do{
    	System.out.println("\nInvalid Password!!!");
    	System.out.println("Please contain at least 7 characters and at least one letters and digit");
    	System.out.print("Enter your password(it should contain at least 7 characters and  contain at least one letters and digit)    :");
    	pass=scan.nextLine();
     	System.out.println(checkPassword(pass));
	   	System.out.print(pass);
   		}while(checkPassword(pass)==false);
    	System.out.println("\nabc");
  	}
   } 
   	 
   	public static void managerMenu(){
     	System.out.println("\n1.View Product Details");
	   	System.out.println("2.Add Product");
    	System.out.println("3.Update Product");
    	System.out.println("4.Search Product");
    	System.out.println("5.Delete Product");
     	System.out.println("6.View Staff Details");
    	System.out.println("7.Add Staff");
    	System.out.println("8.Update Staff");
    	System.out.println("9.Search Staff");
    	System.out.println("10.Delete Staff");
    	System.out.println("11.Make Order");
    	System.out.println("12.Search Payment");
    	System.out.println("13.Refund");
    	System.out.println("14.Generate Daily Total Sales Report");
    	System.out.println("15.Generate Daily Total Sales Based On Product Report");
   	} 
   	
   	public static void staffMenu(){
   		System.out.println("1.Make Order");
    	System.out.println("2.View Product Details");		
    	System.out.println("3.Search Product");

   	}
   		  		
	public static void work(Employee[] employee,Login[] login,Product[] product,Payment[] payment,ProductSalesReport productSalesReport,TotalSalesReport totalSalesReport){
		String id,pass;
    	int choice;
    	char select;
    	char close='Y';
		Scanner scan=new Scanner(System.in);
    	do{
    	System.out.println("Welcome to ABC POS System\n");
    	do{
		System.out.print("Please enter your ID >");
    	id=scan.nextLine();
     	System.out.print("Please enter your password >");
    	pass=scan.nextLine();
    	if(checkLogin(id,pass,employee,login)==false){
    	System.out.println("\nFail to Login!!!\nWrong ID or Password!!!\nPlease try again!!!\n");
    	}
    	}while(checkLogin(id,pass,employee,login)==false);
		if(checkLogin(id,pass,employee,login)){
			if(Character.toUpperCase(id.charAt(0))=='M'){
		do{
 		try {
 		managerMenu();
    	System.out.print("\nWhat do you want to do ?\nPlease enter the choice : ");
    	choice=scan.nextInt();
    	do{
    	switch(choice){
    		case 1:
 				printProduct(product);
 				break;
    		case 2:
    			addProduct(product);
    			break;
    		case 3:
    			updateProduct(product);
    			break;
     		case 4:
    			searchProduct(product);
 				break;    		
 			case 5:
    			deleteProduct(product);
 				break; 
    		case 6:
 				printEmployee(employee);
 				break;   		
    		case 7:
    			addEmployee(employee,login);
    			break;
    		case 8:
    			updateEmployee(employee);
    			break;
     		case 9:
    			searchEmployee(employee);
 				break;    		
 			case 10:
    			deleteEmployee(employee,login);
 				break; 
    		case 11:
    			makeOrder(product,payment);
    			break;
    		case 12:
    			searchPayment(payment);
    			break;
 			case 13:
 				refund(payment);
 				break;
 			case 14:
 				System.out.println(totalSalesReport);
 				break;
			case 15:
				printProductReport(product,payment,productSalesReport);
				break;
 			default:{
 				System.out.println("Invalid\nEnter only option in the list\n");
    			System.out.print("\nWhat do you want to do ?\nPlease enter the choice : ");
    			choice=scan.nextInt();
		   	}}
    	}while(choice>15||choice<1);		
     	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
				catch (ArithmeticException arithmeticException) {
				System.err.println("Number enter cant be zero, please try again");
				scan.nextLine();}
	   	System.out.print("\nContinue to work ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);    	
    	}while(select=='Y');
			}
		else if(Character.toUpperCase(id.charAt(0))=='S'){
		do{
 		try {
 		do{
 		staffMenu();
     	System.out.println("Enter the choice : ");
    	choice=scan.nextInt();
    	switch(choice){
     		case 1:
    			makeOrder(product,payment);
    			break;
    		case 2:
 				printProduct(product);
 				break;
     		case 3:
    			searchProduct(product);
 				break;    		
 			default:{
 				System.out.println("Invalid\nEnter only option in the list\n");
    			System.out.println("Enter the choice : ");
    			choice=scan.next().charAt(0);
	   				}   		
	   				}
 		}while(choice<1||choice>3);
     	    	} catch (InputMismatchException inputMismatchException) {
				System.err.println("Please input number only, please try again");
				scan.nextLine();}
				catch (ArithmeticException arithmeticException) {
				System.err.println("Number enter cant be zero, please try again");
				scan.nextLine();}
	   	System.out.print("Continue to work ? (Y for yes) :");
		select=scan.next().charAt(0);
		select=Character.toUpperCase(select);    	
		}while(select=='Y');
 	}
}    	
	   	System.out.print("Close System ? (N for no) :");
		close=scan.next().charAt(0);
		close=Character.toUpperCase(close);
		scan.nextLine();    	
		}while(close=='N');
	}
}