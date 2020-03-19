package com.capg.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capg.dao.TrackDetails;
import com.capg.service.TrackService;

import java.util.List;
public class TrackDetailsTesting {
	TrackDetails obj;
	    Integer List[]= {1,2,3,4,5,6,7};
	    
	    @Before
		public void setUp()
		{
			obj=new TrackDetails();
		}
		@Test
		public void testgetId()
		{
			List<Integer> list=obj.getId();
			assertArrayEquals(List,list.toArray());
		}
		@Test
		public void testGetTrackOrderDetailsDao()
		{
			assertEquals("Order Id is->2 Supplier Name is-> Z square Location -> Kanpur Expected delivery-> 2020-05-05",obj.getTrackOrderDetails(2));
		}
		
		@Test
		public void testGetTrackOrderDetailsDao1()
		{
			assertEquals("No Data Found",obj.getTrackOrderDetails(10));		
		}
	
		 @After
		    public void cleaUp()
		    {
		    	obj=null;
		    }
	}



