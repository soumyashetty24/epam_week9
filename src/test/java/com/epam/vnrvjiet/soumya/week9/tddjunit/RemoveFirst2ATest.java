package com.epam.vnrvjiet.soumya.week9.tddjunit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RemoveFirst2ATest {

	/*TODO list for my feature
	 * 1.Empty String 		    "" => "" 			Success
	 * 2.Single A				A => "" 			Success
	 * 3.One non A				D => D				Success
	 * 4.Double A				AA => ""			Success
	 * 5.A at position 1   	    ABCD => BCD			Success
	 * 6.A at position 2   	    BACD => BCD			Success
	 * 7.A at position 1 and 2  AABB => BB			Success
	 * 8.A at position 2 and 3  BAACD=> BACD		Success
	 * 9.All A's				AAAA => AA			Success
	 * 10.N characters			ABCDABDC =>BCDABDC	Success
	 */
	
	RemoveFirst2A removeFirst2A;
	
	@BeforeEach
	void setUp()
	{
		removeFirst2A = new RemoveFirst2A();
	}
	
	@Test
	void testEmptyString() 
	{
		assertEquals("", removeFirst2A.remove(""));
	}
	
	@Test
	void testSingleA() 
	{
		assertEquals("", removeFirst2A.remove("A"));
	}
	
	@Test
	void testOneNonA() 
	{
		assertEquals("D", removeFirst2A.remove("D"));
	}
	
	@Test
	void testDoubleA() 
	{
		assertEquals("", removeFirst2A.remove("AA"));
	}
	
	@Test
	void testAatPos1() 
	{
		String testresult = removeFirst2A.remove("ABCD");
		assertEquals("BCD", testresult);
	}
	
	@Test
	void testAatPos2() 
	{
		assertEquals("BCD", removeFirst2A.remove("BACD"));
	}
	
	@Test
	void testAatPos1and2() 
	{
		assertEquals("BB", removeFirst2A.remove("AABB"));
	}
	
	@Test
	void testAatPos2and3() 
	{
		assertEquals("BACD", removeFirst2A.remove("BAACD"));
	}
	
	@Test
	void testAllAs() 
	{
		assertEquals("AA", removeFirst2A.remove("AAAA"));
	}
	
	@Test
	void testNChars() 
	{
		assertEquals("BCDABDC", removeFirst2A.remove("ABCDABDC"));
	}


}
