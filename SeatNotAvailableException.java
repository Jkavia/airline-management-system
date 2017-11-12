package com;

public class SeatNotAvailableException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage()
	{
		String a="Currently Seat is not available. It is already occupied by other customer.";
		return a;
	}
	

}
