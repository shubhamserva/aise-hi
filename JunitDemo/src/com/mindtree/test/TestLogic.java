package com.mindtree.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mindtree.program.Program;  

public class TestLogic {

	
	@Test
	public void findmaxTest() 
	{
		assertEquals(7,Program.findMax(new int[] {2,4,1,5,7,}));
		assertEquals(3,Program.findMax(new int[] {3,6,4,7,3,4}));
	}

}
