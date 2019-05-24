package tests;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import model.Bill;
import model.User;
/**
 * 
 * @author Kyle Bittner
 * @since 5/22/2019
 * @version 1.00.00
 * 
 *
 *Tests all methods in User class except getters and setters.
 */
public class UserTest {
	
	/**Test Constructor of user class, currentBill variable assignment*/
	@Test
	public void constructorTest() {
		User user = new User("kyle", "kyle@uw.edu");
		assertThat("kyle", is(user.getName()));
	}
	
	/**Test Constructor of user class, userName variable assignment*/
	@Test
	public void constructorTest2() {
		User user = new User("kyle", "kyle@uw.edu");
		assertThat("kyle@uw.edu", is(user.getEmail()));
	}
	
	
}