package j_test;
import jtest.*;
import org.junit.Assert;
import org.junit.Test;


public class J_testcases {

	@Test
	public void test() {
		Javatest obj=new Javatest();
		Assert.assertEquals("BCD", obj.testcode("ABCD",4));
		Assert.assertEquals("CD", obj.testcode("AACD",4));
		Assert.assertEquals("BCD", obj.testcode("BACD",4));
		Assert.assertEquals("BBAA", obj.testcode("BBAA",4));
		Assert.assertEquals("BAA", obj.testcode("AABAA",5));
	}

}
