package com.accolite.miniau;

public class OfficeAddress implements Address
{
	private int pinCode;
	private String city;

	public OfficeAddress(int pinCode, String city)
	{
		super();
		this.pinCode = pinCode;
		this.city = city;
	}

	public int getPinCode()
	{
		return pinCode;
	}

	public void setPinCode(int pinCode)
	{
		this.pinCode = pinCode;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

}
