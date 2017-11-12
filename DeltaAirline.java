package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class DeltaAirline implements Flight{
private ArrayList<Seat> seatList;
private ArrayList<Customer> custList;
public DeltaAirline() {
this.seatList=new ArrayList<Seat>();
this.custList=new ArrayList<Customer>();
}

@Override
public int addCustomer(Customer c) throws CustomerAlreadyExistException {
	//TODO Auto-generated method stub
	int count=1;
	boolean flag = true;
	if(this.custList!=null && !this.custList.isEmpty())
	{
		for(Customer a : this.custList)
		{
			if(a != null && c != null && c.getCustomerName().equals(a.getCustomerName()) && c.getPassportNo().equals(a.getPassportNo()))
			{
				flag=false;
				throw new CustomerAlreadyExistException();
			}
			count=count+1;
		}
	}
	if(flag) 
	{
		custList.add(c);
	}
	return count;
	
}
@Override
public int addSeat(Seat s) {
	// TODO Auto-generated method stub
	int count=1;
	boolean flag = true;
	if(this.seatList!=null && !this.seatList.isEmpty())
	{
		for(Seat a : this.seatList)
		{
			if(a != null && s != null && s.getSeatNo()==a.getSeatNo())
			{
				flag=false;
				break;
			}
			count=count+1;
		}
	}
	if(flag) 
	{
		seatList.add(s);
	}
	return count;
}
@Override
public int allocateSeat(String st) throws SeatNotAvailableException {
	// TODO Auto-generated method stub
			int number=-1;
			if(this.seatList!=null && !this.seatList.isEmpty())
			{
				for(Seat a : this.seatList)
				{
					if(a != null && a.getSeatType().equals(st))
					{
						if(!a.isSeatOccupied())
						{
							a.setSeatOccupied(true);
							System.out.println(a.isSeatOccupied());
							number=a.getSeatNo();
							break;
						}
						else{
							throw new SeatNotAvailableException();
						}
						
						 
					}
					
				}
			}
			
			return number;
}
public TreeSet<String> getDifferentPassportNos()
{
	TreeSet<String> ts = new TreeSet<String>();
	if(custList!=null && !custList.isEmpty())
	{
		for(Customer ct:custList)
		{
			if(ct!=null && ct.getPassportNo()!=null)
			{
				String a=ct.getPassportNo();
				ts.add(a);
			}
			
		}
	}
	
	return ts;
}
public HashMap<String,ArrayList<Seat>>getMapByAllocation()
{
	HashMap<String, ArrayList<Seat>> hmp=new HashMap<String, ArrayList<Seat>>();
	ArrayList<Seat> allocatedseatList=new ArrayList<Seat>();
	ArrayList<Seat> unallocatedseatList=new ArrayList<Seat>();
	
	if(seatList!=null && !seatList.isEmpty())
	{
		for(Seat st:seatList){

			if(st!=null && st.isSeatOccupied())
			{
				allocatedseatList.add(st);
				//acid.put("allocated", st);
			}
		if(st!=null && !st.isSeatOccupied())
		{
			unallocatedseatList.add(st);
			//acid.put("allocated", st);
		}
		}
	}
	hmp.put("allocated", allocatedseatList);
	hmp.put("unallocated", unallocatedseatList);
	return hmp;
}
}