package com.capg.dao;


import java.util.*;

import com.capg.dto.TrackOrderDetailsCons;
import com.capg.interfaces.TrackDetailsInterface;
import com.capg.repository.TrackOrderRepository;
public class TrackDetails implements TrackDetailsInterface {
	Map<Integer,TrackOrderDetailsCons>track;
	 //constructer
	 public TrackDetails()
	 {
		track=TrackOrderRepository.get();
	 }
	 //this function is used to get order ids and return ids in list form
	 public List<Integer> getId()
	 {
		List<Integer> list=new ArrayList<Integer>();
	    for(Map.Entry<Integer,TrackOrderDetailsCons>map:track.entrySet())
		{
			list.add(map.getKey()) ;
		}
		 return list;
	 }
	//this function gives the result by validating the id 
	public String getTrackOrderDetails(Integer id)
	 {
		String result="No Data Found";
		for(Map.Entry<Integer,TrackOrderDetailsCons> map:track.entrySet())
		{
			if(map.getKey().equals(id))
			{
				result= "Order Id is->"+ map.getValue().getOrder_Id()+" Supplier Name is-> "+map.getValue().getSupplierName()+" Location -> "+map.getValue().getPlace()+" Expected delivery-> "+map.getValue().getDate();
			}	 
		}
		 return result;	
	 }
}
