package JUnitTestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Solutions.LeapYear;

class TestCases {

	LeapYear ly = new LeapYear();
	@Test
	void testLeapYears() {
		assertTrue(ly.checkLeapYear(2016));
		assertTrue(ly.checkLeapYear(2020));
		assertFalse(ly.checkLeapYear(2018));
		assertTrue(ly.checkLeapYear(2017));
		assertTrue(ly.checkLeapYear(2000));
		assertTrue(ly.checkLeapYear(20000));
		assertTrue(ly.checkLeapYear(18000));
		try{
			ly.checkLeapYear(-100);
			fail("Exception not handled");
		}catch(Exception e){
		}
		try{
			assertTrue(ly.checkLeapYear(0));
			fail("Exception not handled");
		}catch(Exception e) {
			
		}
		assertFalse(ly.checkLeapYear(19000));	
	}

}
