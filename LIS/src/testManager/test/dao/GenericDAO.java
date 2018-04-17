/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testManager.test.dao;

import java.util.List;

/**
 *
 * @author pau
 * @param <T>
 */
public interface GenericDAO<T> {

	void Add(T pObject);

	void Del(T pObject);

	void Mod(T pObject);

	List<T> getList();
	
}
