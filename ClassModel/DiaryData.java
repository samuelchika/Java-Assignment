import java.util.Vector;
class DiaryData {
	private Vector diary;
	
	public DiaryData() {
		diary = new Vector();
	}
	
	public boolean addContact(Diary d) {
		boolean added = false;
		if(diary.isEmpty()) {
			diary.add(d);
			added = true;
		} else {
			if(checkDuplicate(d)) {
				//there is a duplicate
				added = false;
			} else {
				//we sort before we add. 
				Diary d1;
				int checkPos;
				for(int i = 0; i < diary.size() && !added; i++) {
					d1 = (Diary)diary.elementAt(i);
					checkPos = d1.getName().compareTo(d.getName());
					if(checkPos >= 0) {
						diary.insertElementAt(d, i);
						added = true;
					}
				}
				if(!added) {
					diary.add(d);
					added = true;
				}
			}
		}
		return added;
	}
	
	public boolean checkDuplicate(Diary d) {
		Diary d1;
		boolean found = false;
		
		for(int i = 0; i < diary.size() && !found; i++) {
			d1 = (Diary)diary.elementAt(i);
			if((d1.getName().equals(d.getName())) || (d1.getEmail().equals(d.getEmail())) || (d1.getPhone().equals(d.getPhone()))) {
				//if any of the statment is true, then we don't want to duplicate it.
				found = true;
			}
		}
		return found;		
	}
	public boolean changePhone(String name, String phone) {
		//we have to check if the name exist first before we think of changing
		Diary d = searchName(name);
		if(d != null) {
			d.setPhone(phone);
			return true;
		} else {
			//we don't have such user in our database.
			return false;
		}
		
	}
	public boolean changeEmail(String name, String email) {
		//we have to check if the name exist first before we think of changing
		Diary d = searchName(name);
		if(d != null) {
			d.setEmail(email);
			return true;
		} else {
			//we don't have such user in our database.
			return false;
		}
	}
	public Diary searchName(String name) {
		// TODO Auto-generated method stub
		Diary d = null;
		boolean found = false;
		for(int i = 0; i < diary.size() && !found; i++) {
			d = (Diary)diary.elementAt(i);
			if(name.equals(d.getName())) {
				found = true;
			}
		}
		return (found) ? d : null;
		//return null;
	}
	public void displayContact(String name) {
		Diary d = searchName(name);
		System.out.println(d.display());
	}
	public void displayAll() {
		Diary t;
		formating(78);
		System.out.printf("|%-4s|%-20s|%-30s|%-12s|%-12s|\n", "S/No","Name", "Email", "Phone Number", "Date");
		formating(78);
		for(int i = 0; i < diary.size(); i++) {
			int j = i + 1;
			t = (Diary)diary.elementAt(i);
			System.out.printf("|%-4d|%-20s|%-30s|%-12s|%-12s|\n", j,t.getName(), t.getEmail(), t.getPhone(), t.getDate());
			formating(78);
			//System.out.println(t.display());
			//System.out.println();
		}
	}
	public void formating(int amount) {
		System.out.printf("+%-4s+%-20s+%-30s+%-12s+%-12s+", "----","--------------------", "------------------------------", "------------", "------------");
		System.out.println();
		
	}
	
	public void deleteContact(String name) {
		Diary d = searchName(name);
		if(d != null) {
			diary.remove(d);
			System.out.println("Contact Successfully Deleted");
		} else {
			System.out.println("Contact Don't exist");
		}
	}
	public void deleteAll() {
		diary.removeAllElements();
		System.out.println("Diary Empty");
	}
}
