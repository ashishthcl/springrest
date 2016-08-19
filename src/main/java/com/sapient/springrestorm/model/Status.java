package com.sapient.springrestorm.model;

public class Status
{

	private int code;
	private String message;


	public Status(final int code, final String message)
	{
		this.code = code;
		this.message = message;
	}


	public int getCode()
	{
		return code;
	}

	public void setCode(final int code)
	{
		this.code = code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(final String message)
	{
		this.message = message;
	}



}
