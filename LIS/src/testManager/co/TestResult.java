/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.co;

import java.util.Iterator;
import java.util.List;
import testManager.operations.entity.Operation;
import testManager.test.entity.OrderTest;

/**
 *
 * @author pau
 */
public class TestResult {
	public void applyOperations (OrderTest orderTest){
		
		List<Operation> operations = orderTest.getTest().getOperations();
		Iterator<Operation> it = operations.iterator();
		
		while(it.hasNext())
		{
			Operation operation = it.next();
			
			operation.apply(orderTest);
		}
	}
	
}
