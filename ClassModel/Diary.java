class Diary {
	private String name;
	private String phone;
	private String email;
	private String date;
	
	public Diary(String name, String phone, String email, String date) {
		this.date = date;
		this.phone = phone;
		this.email = email;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String display() {
		return "\nName = " + name + ", \nPhone = " + phone + ", \nEmail = " + email + ", \nDate = " + date;
	}
	
}
