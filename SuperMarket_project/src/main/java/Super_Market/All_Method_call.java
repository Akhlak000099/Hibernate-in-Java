package Super_Market;

import java.util.*;

import super_merket_demo.SuperMarketProduct;
import super_merket_demo.SuperMarket_Dao;

public class All_Method_call {
String p_name,p_category,p_expiryDate,p_price;
Scanner ch=new Scanner(System.in);	

SuperMarketProduct smp=new SuperMarketProduct(); 
SuperMarket_Dao smd=new SuperMarket_Dao();

    public void add_product() {
      
	  System.out.println("Enter Product Name");
	  p_name=ch.nextLine();
	  System.out.println("Enter Product category");
	  p_category=ch.nextLine();
	  System.out.println("Enter Product expiryDate");
	  p_expiryDate=ch.nextLine();
	  System.out.println("Enter Product Price");
	  p_price=ch.nextLine();
	  
	  smp=new SuperMarketProduct(p_name,p_category,p_expiryDate,p_price);
	  
//	  smd.save_product(smp);
	  smd.product_update(smp);
	  System.out.println("Product is add successfully");
	  
      
	  
	}
    public static void main(String[] args) {
    	All_Method_call obj=new All_Method_call();
    	obj.add_product();
	}
}
