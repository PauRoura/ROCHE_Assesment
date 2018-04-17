/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.operations.entity;

import testManager.test.entity.OrderTest;

/**
 *
 * @author pau
 */
public class AdditionOperation extends ArythmeticOperation{

	public AdditionOperation(int value) {
		super(value);
	}

	@Override
	public void apply(OrderTest orderTest) {
		orderTest.setResult(orderTest.getResult() + value);
	}
	
}
