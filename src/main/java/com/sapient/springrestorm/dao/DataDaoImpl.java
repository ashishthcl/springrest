package com.sapient.springrestorm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sapient.springrestorm.model.Employee;


@Repository("dataDao")
public class DataDaoImpl implements DataDao
{



	@Autowired
	//	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	Session session = null;
	Transaction txn = null;

	public boolean addEntity(final Employee e) throws Exception
	{
		session = sessionFactory.openSession();
		txn = session.beginTransaction();
		session.save(e);
		txn.commit();
		session.close();
		return false;
	}

	public Employee getEntityById(final int empId) throws Exception
	{
		session = sessionFactory.openSession();
		txn = session.beginTransaction();
		final Employee emp = (Employee) session.load(Employee.class, new Long(empId));
		txn.commit();
		session.close();
		return emp;
	}

	public List getEntityList() throws Exception
	{
		session = sessionFactory.openSession();
		txn = session.beginTransaction();
		final List empList = session.createCriteria(Employee.class).list();
		txn.commit();
		session.close();
		return empList;
	}

	public boolean deleteEntity(final int id) throws Exception
	{
		session = sessionFactory.openSession();
		txn = session.beginTransaction();
		final Object obj = session.load(Employee.class, new Long(id));
		session.delete(obj);
		txn.commit();
		session.close();
		return false;
	}

}
