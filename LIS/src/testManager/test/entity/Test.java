/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.test.entity;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import testManager.operations.entity.Operation;

/**
 *
 * @author pau
 */
public class Test implements Serializable{

	private int id;
	private String name;
	private String Abbreviation;
	private List<Operation> operations;

	
	public Test(){
		this.operations = new LinkedList<>();
	}
	
	public void AddOperation(Operation operation){
		operations.add(operation);
	}
	
	public void SetOperations(List<Operation> operations){
		this.operations = operations;
	}

	public List<Operation> getOperations() {
		return operations;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
		
	/**
	 * @return the Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param Name the Name to set
	 */
	public void setName(String Name) {
		this.name = Name;
	}

	/**
	 * @return the Abbreviation
	 */
	public String getAbbreviation() {
		return Abbreviation;
	}

	/**
	 * @param Abbreviation the Abbreviation to set
	 */
	public void setAbbreviation(String Abbreviation) {
		this.Abbreviation = Abbreviation;
	}    

	void applyOperations(OrderTest orderTest) {
		Iterator<Operation> it = this.operations.iterator();
		
		while(it.hasNext())
		{
			Operation operation = it.next();
			
			operation.apply(orderTest);
		}
	}
}
