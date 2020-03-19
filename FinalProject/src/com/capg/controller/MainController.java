package com.capg.controller;

import java.util.*;

import com.capg.exception.NoDataFoundException;
import com.capg.exception.NotNegativeId;
import com.capg.service.TrackService;
public class MainController {
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);	
	 label: while(true)
	 {
		 System.out.println("Welcome to TrackOrder System:");
		 System.out.println("Enter Your Choice \n 1:Track Order   \n 2:Exit");
		 int choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1: 
	         TrackService obj=new TrackService();
             System.out.println("Welcome to Tracking order");
	         System.out.println("-------------------------");
	         // To get all the available IDs
	         System.out.println("Available Order IDs are- \n"+obj.getId());
	         System.out.println("Enter the ID from the given List...");
	         
	         //To call the details of particular ID
	         try {
	        	 while(!sc.hasNextInt())
	        	 {
	        		 System.out.println("Please give Integer type ID");
	        		 sc.next();
	        		 
	        	 }
	        	 int id=sc.nextInt();
	        	  if(id<0)
	        	  {
	        		  throw new NotNegativeId("Id Should be positive");
	        	  }
	        	  
	        	  
				System.out.println( obj.getTrackOrderDetailsService(id));
			} catch (NoDataFoundException | NotNegativeId e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	         break;
	
	 
	 case 2: break label;
	 default:System.out.println("You Entered the wrong choice");
	 }
	 }
	 sc.close();
  }
}
