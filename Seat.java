package com;

public class Seat {
	private int seatNo;
	private String SeatType;
	boolean seatOccupied;
	public Seat(int seatNo, String seatType) {
		this.seatNo = seatNo;
		SeatType = seatType;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getSeatType() {
		return SeatType;
	}
	public void setSeatType(String seatType) {
		SeatType = seatType;
	}
	public boolean isSeatOccupied() {
		return seatOccupied;
	}
	public void setSeatOccupied(boolean seatOccupied) {
		this.seatOccupied = seatOccupied;
	}
	@Override
	public int hashCode() {
		System.out.println("IN HAshcode");
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((SeatType == null) ? 0 : SeatType.hashCode());
		result = prime * result + seatNo;
		result = prime * result + (seatOccupied ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		if (SeatType == null) {
			if (other.SeatType != null)
				return false;
		} else if (!SeatType.equals(other.SeatType))
			return false;
		if (seatNo != other.seatNo)
			return false;
		if (seatOccupied != other.seatOccupied)
			return false;
		return true;
	}
	
	

}
