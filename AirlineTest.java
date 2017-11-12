package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class AirlineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("Mike", 45, "NBMNJHY");
		Customer c2=new Customer("Jack", 65, "HJUTRE");
		Customer c3=new Customer("Ricky", 39, "NBMNJHY");
		Customer c4=new Customer("Pathan", 23, "FGHYTRE");
		Customer c5=new Customer("Mike", 45, "NBMNJHY");
		Seat s1=new Seat(123, "2 seater");
		Seat s2=new Seat(324, "3 seater");
		
		DeltaAirline da=new DeltaAirline();
	
		try {
			int a=da.addCustomer(c1);
			int b=da.addCustomer(c2);
			int c=da.addCustomer(c3);
			int d=da.addCustomer(c4);
			int g=da.addSeat(s2);
			int h=da.addSeat(s1);
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(g);
			System.out.println(h);
			int i=da.allocateSeat("2 seater");
			int j=da.allocateSeat("3 seater");
			System.out.println(i);
			System.out.println(j);
			//int e=da.addCustomer(c5);
			//System.out.println(e);
		} catch (CustomerAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SeatNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TreeSet<String>pnos=da.getDifferentPassportNos();
		for(String st:pnos)
		{
			System.out.println(st);
		}
		HashMap<String, ArrayList<Seat>> hmp=da.getMapByAllocation();
		 Set<String> keys = hmp.keySet();
		 for(String s:keys){
	            System.out.println(s+"==>"+hmp.get(s));
	        }

	}

}
