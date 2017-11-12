package com;

public class CustomerAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getMessage()
	{
		String a="Customer Already Exist !! Please recheck before adding new Customer.";
		return a;
	}
	
	
	

}
