package com;

public class Customer implements Comparable<Customer>{

	private String customerName;
	private int age;
	private String passportNo;
	public Customer(String customerName, int age, String passportNo) {
		this.customerName = customerName;
		this.age = age;
		this.passportNo = passportNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public int compareTo(Customer other)
	{
		System.out.println("Inside CompareTo Method");
		return this.getPassportNo().compareTo(other.getPassportNo());
       
	}
	
	
}
