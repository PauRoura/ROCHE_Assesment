/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.test.dao;

import java.util.LinkedList;
import java.util.List;
import testManager.test.entity.Test;

/**
 *
 * @author pau
 */
public class TestDAO implements GenericDAO<Test>{

	List<Test> tests;
	
	public TestDAO(){
		tests = new LinkedList<>();
	}
	
	@Override
	public void Add(Test pTest) {
		tests.add(pTest.getId(), pTest);
	}

	@Override
	public void Mod(Test pTest) {
		tests.set(pTest.getId(), pTest);
	}

	@Override
	public void Del(Test pTest) {
		tests.remove(pTest.getId());
	}

	@Override
	public List<Test> getList() {
		return tests;
	}
	
}
