package com.sapient.springrestorm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@SuppressWarnings(value = "javadoc")
@Entity
@Table(name = "EMPLOYEE")
@JsonIgnoreProperties(
{ "hibernateLazyInitializer", "handler" })
//@JsonIgnoreProperties({})
public class Employee implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -3823848512390039225L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private String phone;

	public long getId()
	{
		return id;
	}

	public void setId(final long id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(final String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(final String phone)
	{
		this.phone = phone;
	}



}
