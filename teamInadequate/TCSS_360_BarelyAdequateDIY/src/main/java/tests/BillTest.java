package tests;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import model.Bill;
/**
 * 
 * @author Kyle Bittner
 * @since 5/22/2019
 * @version 1.00.00
 * 
 *
 *Tests all methods in bill class except getters and setters.
 */
public class BillTest {
	
	/**Test Constructor of bill class, currentBill variable assignment*/
	@Test
	public void constructorTest() {
		Bill bill = new Bill();
		assertThat(0.0, is(bill.getCurrentBill()));
	}
	
	/**Test Constructor of bill class, projectedBill variable assignment*/
	@Test
	public void constructorTest2() {
		Bill bill = new Bill();
		assertThat(0.0, is(bill.getProjectedBill()));
	}
	
	/**Test Constructor of bill class, projectedBill variable assignment with parameters*/
	@Test
	public void constructorTest3() {
		Bill bill = new Bill(4,6);
		assertThat(6.0, is(bill.getProjectedBill()));
	}
	
	/**Test Constructor of bill class, currentBill variable assignment with parameters*/
	@Test
	public void constructorTest4() {
		Bill bill = new Bill(4,6);
		assertThat(4.0, is(bill.getCurrentBill()));
	}
	
	/**Tests getMonthlySavings method negative value.*/
	@Test
	public void getMonthlySavingsTest() {
		Bill bill = new Bill(4,6);
		assertThat(-2.0, is(bill.getMonthlySavings()));
	}
	
	/**Tests get monthly savings method positive value.*/
	@Test
	public void getMonthlySavingsTest2() {
		Bill bill = new Bill(6,4);
		assertThat(2.0, is(bill.getMonthlySavings()));
	}

}
