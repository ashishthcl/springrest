package com.sapient.springrestorm.dao;

import java.util.List;

import com.sapient.springrestorm.model.Employee;


/**
 *
 */
public interface DataDao
{

	public boolean addEntity(Employee e) throws Exception;

	public Employee getEntityById(int empId) throws Exception;

	public List getEntityList() throws Exception;

	public boolean deleteEntity(int id) throws Exception;

}
