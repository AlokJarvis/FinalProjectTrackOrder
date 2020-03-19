package com.capg.service;


import java.util.*;

import com.capg.dao.TrackDetails;
import com.capg.exception.NoDataFoundException;
import com.capg.exception.NotNegativeId;
import com.capg.interfaces.TrackServiceInterface;
public  class TrackService implements TrackServiceInterface
{
	TrackDetails obj=new TrackDetails();
	public List<Integer> getId()
	 {
	     return  obj.getId();
	 }
	//To get the details of particular Id
	public String getTrackOrderDetailsService(Integer id)throws NoDataFoundException,NotNegativeId
	 {
		 String result =null;
		 if(id<0)
		 {
			 throw new NotNegativeId("Not a negative number");
		 }
		 else if(id==0)
		 {
			 result="Id can not be 0";
			 return result;
		 }
		 for(Integer i:obj.getId())
		 {
			 if(i.equals(id))
			 {
				result= obj.getTrackOrderDetails(id); 	 
			 }
		 }
		 if(result==null)
			 
		 {
			 throw new NoDataFoundException("Not a Valid Id"); 
		 }
		 
		
		 return result;
	 }
	
}
