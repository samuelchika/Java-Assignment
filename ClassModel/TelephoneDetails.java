class TelephoneDetails {
	private String surname;
	private String firstname;
	private String number;
	
	public TelephoneDetails(String surname, String firstname, String number) {
		this.firstname = firstname;
		this.surname = surname;
		this.number = number;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	//this is use to compare surname.
	//this will return positive if the surname is greater in unicode value
	// it will return 0 if they are same
	//it will return negative if the name is less
	public int compareSurname(TelephoneDetails t) {
		return surname.compareTo(t.getSurname());
	}
	public boolean checkNumber(TelephoneDetails t) {
		return number.equals(t.getNumber());
	}
	public boolean sameNumber(String num) {
		return number.equals(num);
	}
	public boolean existingUser(String sName, String fName) {
		return this.surname.equals(sName) && this.firstname.equals(fName);
	}

	public String display() {
		return "Surname = '" + surname + "', \nFirstname = '" + firstname + "', \nNumber = '" + number + "'";
	}
	
	
	
}
