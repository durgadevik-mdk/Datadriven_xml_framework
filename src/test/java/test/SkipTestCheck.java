package test;

import org.testng.annotations.Test;

public class SkipTestCheck {
	
	@Test(enabled = false)
	public void test1() {
		
		System.out.println("i am happy");
	}
	public void test2() {
		
		System.out.println("i am not happy");
	}

}
