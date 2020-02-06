import java.util.Vector;

class Tele {
	private Vector telephone;
	
	public Tele() {
		telephone = new Vector();
	}
	
	public boolean addPhone(TelephoneDetails t){
		TelephoneDetails t1;
		boolean found = false;
		int check;
		//we need to be sure the user dont exist;
		if(telephone.isEmpty()) {
			telephone.add(t);
			found = true;
		} else {
			t1 = searchDirectory(t.getNumber());			
			if(t1 == null) { // user don't exist
				for(int i = 0; i < telephone.size() && !found; i++) {
					t1 = (TelephoneDetails)telephone.elementAt(i);
					check = t1.compareSurname(t);
					if(check >= 0) {
						telephone.insertElementAt(t, i);
						found = true;
					}
				}
				if(!found) {
					telephone.add(t);
					found = true;
				}
				
			} else {
				//user exist
				System.out.println(t1.getNumber() + " exist wih the following details: \n" + t1.display());
				found = false;
			}
		}
		
		return found;
	}
	
	public boolean deleteEntry(String num) {
		TelephoneDetails t;
		t = searchDirectory(num);
		if(t != null) {
			telephone.remove(t);
			return true;
		} else {
			return false;
		}
				
	}
	public void listDirectory() {
		TelephoneDetails t;
		System.out.printf("|%-4s|%-12s|%-12s|%-12s|\n", "S/No","Surname", "Firstname", "Phone Number");
		formating(45);
		for(int i = 0; i < telephone.size(); i++) {
			int j = i + 1;
			t = (TelephoneDetails)telephone.elementAt(i);
			System.out.printf("|%-4d|%-12s|%-12s|%-12s|\n", j,t.getSurname(), t.getFirstname(), t.getNumber());
			formating(45);
			//System.out.println(t.display());
			//System.out.println();
		}
	}
	public void formating(int amount) {
		System.out.printf("+%-4s+%-12s+%-12s+%-12s+", "----","------------", "------------", "------------");
		System.out.println();
		//		for(int v = 0; v < amount; v++) {
//			System.out.print("-");
//		}
	}
	
	public String getNumber(String sName, String fName) {
		TelephoneDetails t;
		t = searchDirectory(sName, fName);
		if(t != null) {
			return t.getNumber();
		} else {
			return "Not Found";
		}
	}
	
	
	public TelephoneDetails searchDirectory(String num) {
		TelephoneDetails t = null;
		boolean found = false;
		for(int i = 0; i < telephone.size() && !found; i++) {
			t = (TelephoneDetails)telephone.elementAt(i);
			if(num.equals(t.getNumber())) {
				found = true;
			}
		}
		if(found) {
			return t;
		} else {
			return null;
		}
	}
	
	public TelephoneDetails searchDirectory(String sName, String fName) {
		TelephoneDetails t = null;
		boolean found = false;
		for(int i = 0; i < telephone.size() && !found; i++) {
			t = (TelephoneDetails)telephone.elementAt(i);
			found = t.existingUser(sName, fName);
		}
		return t;
	}
	
}
