package com.capg.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capg.exception.NoDataFoundException;
import com.capg.exception.NotNegativeId;
import com.capg.service.TrackService;

import java.util.*;
public class ServiceTest {
	TrackService obj;
	Integer List[ ]= {1,2,3,4,5,6,7};
	
	@Before
	public void setUp()
	{
		obj=new TrackService();
	}
	
	@Test
	public void testGetId()
	{
		List<Integer>list=obj.getId();
		assertArrayEquals(List,list.toArray());
	
	}
	
	@Test
	public void testGetTrackOrderDetailsService() throws NoDataFoundException, NotNegativeId
	{
		
		assertEquals("Order Id is->2 Supplier Name is-> Z square Location -> Kanpur Expected delivery-> 2020-05-05",obj.getTrackOrderDetailsService(2));	
	}
	
    @Test(expected = NoDataFoundException.class)
    public void  forValidId() throws NoDataFoundException, NotNegativeId
    {	
    assertEquals("Not a valid ", obj.getTrackOrderDetailsService(10));
    }
    
    @Test(expected=NotNegativeId.class)
    public void notNeagativeId() throws NotNegativeId, NoDataFoundException
    {
    	assertEquals("Id should be positive",obj.getTrackOrderDetailsService(-15));
    }
    
    @Test
    public void zeroId() throws NoDataFoundException, NotNegativeId 
    {
    	assertEquals("Id can not be 0",obj.getTrackOrderDetailsService(0));
    }
    @After
    public void cleaUp()
    {
    	obj=null;
    }
}
