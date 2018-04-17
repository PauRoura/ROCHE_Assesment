/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.test.entity;

import java.util.Iterator;
import java.util.List;
import legacy.order.Order;
import testManager.operations.entity.Operation;

/**
 *
 * @author pau
 */
public class OrderTest {
	private final Order order;
	private final Test test;
	private int result;

	public OrderTest(Test test, Order order) {
		this.test = test;
		this.order = order;
	}

	public Test getTest() {
		return test;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
	
	public void applyOperations (){
		
		this.test.applyOperations(this);
	}	
}
