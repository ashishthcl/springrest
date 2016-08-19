package com.sapient.springrestorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sapient.springrestorm.dao.DataDao;
import com.sapient.springrestorm.model.Employee;


@Controller("dataServices")
public class DataServicesImpl implements DataServices
{

	@Autowired
	DataDao dataDao;

	public boolean addEntity(final Employee e) throws Exception
	{
		return dataDao.addEntity(e);
	}

	public Employee getEntityById(final int empId) throws Exception
	{
		return dataDao.getEntityById(empId);
	}

	public List getEntityList() throws Exception
	{
		return dataDao.getEntityList();
	}

	public boolean deleteEntity(final int id) throws Exception
	{
		return dataDao.deleteEntity(id);
	}

}
