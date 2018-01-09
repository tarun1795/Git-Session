package com.accolite.miniau;

public class HomeAddress implements Address
{
	private int pinCode;
	private String city;

	public HomeAddress(int pinCode, String city)
	{
		super();
		this.pinCode = pinCode;
		this.city = city;
	}

	/* (non-Javadoc)
	 * @see com.accolite.miniau.Address#getPinCode()
	 */
	@Override
	public int getPinCode()
	{
		return pinCode;
	}

	/* (non-Javadoc)
	 * @see com.accolite.miniau.Address#setPinCode(int)
	 */
	@Override
	public void setPinCode(int pinCode)
	{
		this.pinCode = pinCode;
	}

	/* (non-Javadoc)
	 * @see com.accolite.miniau.Address#getCity()
	 */
	@Override
	public String getCity()
	{
		return city;
	}

	/* (non-Javadoc)
	 * @see com.accolite.miniau.Address#setCity(java.lang.String)
	 */
	@Override
	public void setCity(String city)
	{
		this.city = city;
	}

}
