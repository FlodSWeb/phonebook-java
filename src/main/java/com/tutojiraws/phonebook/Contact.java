package com.tutojiraws.phonebook;

public class Contact {
	
	private String contactFirstName;
	private String contactLastName;
	private String contactCity;
	private String contactPhone;
	
	public Contact(String contactFirstName, String contactLastName, String contactCity, String contactPhone) {
		this.contactFirstName = contactFirstName;
		this.contactLastName = contactLastName;
		this.contactCity = contactCity;
		this.contactPhone = contactPhone;
	}

	public String getContactFirstName() {
		return contactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	public String getContactLastName() {
		return contactLastName;
	}

	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	public String getContactCity() {
		return contactCity;
	}

	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}



	@Override
	public String toString() {
		return "Contact " + getContactFirstName() + " "
				+ getContactLastName() + ", " + getContactCity() + ", "
				+ getContactPhone() + "\n";
	}

	
}
