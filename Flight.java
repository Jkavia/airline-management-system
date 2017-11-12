package com;

public interface Flight {
	int addCustomer(Customer c) throws CustomerAlreadyExistException;
	int addSeat(Seat s);
	int allocateSeat(String st) throws SeatNotAvailableException;

}
