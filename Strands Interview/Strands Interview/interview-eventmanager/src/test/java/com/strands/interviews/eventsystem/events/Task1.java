package com.strands.interviews.eventsystem.events;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task1 {
	
	SimpleEvent se;
	
	@Before
	public void setUp() throws Exception { 
		se = new SimpleEvent(null);
    }

	@Test
	public void test() {
		Assert.assertEquals(null, se.getSource());
		System.out.println(se.getSource());
	}

}
