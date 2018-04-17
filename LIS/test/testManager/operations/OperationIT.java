/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.operations;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testManager.operations.entity.AdditionOperation;
import testManager.operations.entity.MultiplicationOperation;
import testManager.operations.entity.Operation;
import testManager.test.entity.OrderTest;

/**
 *
 * @author pau
 */
//@RunWith(Suite.class)
public class OperationIT {

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test of applyOperations method, of class Test.
	 */
	@Test
	public void testApplyOperations() {
		System.out.println("applyOperations");
		testManager.test.entity.Test test = new testManager.test.entity.Test();
		
		Operation add = new AdditionOperation(3);
		Operation mult = new MultiplicationOperation(2);
		int expectedResult = 26; //(10 + 3) * 2
		
		test.AddOperation(add);
		test.AddOperation(mult);
		
		OrderTest orderTest = new OrderTest(test, null);
		orderTest.setResult(10);
		orderTest.applyOperations();

		assertEquals(expectedResult, orderTest.getResult());
	}

		@Test
	public void testApplyOperationsOrder() {
		System.out.println("applyOperations");
		testManager.test.entity.Test test = new testManager.test.entity.Test();
		
		Operation mult = new MultiplicationOperation(2);
		Operation add = new AdditionOperation(3);
		int expectedResult = 23; //(10 * 2) +3
		
		test.AddOperation(mult);
		test.AddOperation(add);
		
		OrderTest orderTest = new OrderTest(test, null);
		orderTest.setResult(10);
		orderTest.applyOperations();

		assertEquals(expectedResult, orderTest.getResult());
	}
	
	
}
