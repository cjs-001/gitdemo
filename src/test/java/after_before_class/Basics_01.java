package after_before_class;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics_01 {

	@Test
	void day1() {
		System.out.println("day1");
	}
	
	@Test
	void day2() {
		System.out.println("day2");
	}
	
	@Test
	void day3() {
		System.out.println("day3");
	}
	
	@Test
	void developbranch() {
		System.out.println("day3");
	}
	
	@BeforeTest
	void beforeTest()
	{
		System.out.println("--------------beforeTest-----------");
	}
	
	@AfterTest
	void afterTest()
	{
		System.out.println("--------------afterTest-----------");
	}
}
