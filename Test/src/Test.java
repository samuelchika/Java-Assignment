import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
//		//JOptionPane.showMessageDialog(null, "Welcome to my Page", "Welcome", JOptionPane.DEFAULT_OPTION);
//		JOptionPane.showConfirmDialog(null, "Welcome Home", "Welcome", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
//		String s = JOptionPane.showInputDialog(null, "Enter Your first name: ", "First Name", JOptionPane.OK_CANCEL_OPTION);
//		int a = JOptionPane.showConfirmDialog(null, "Your name is " + s, "Confirm Name", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
//		if(a == JOptionPane.OK_OPTION) {
//			JOptionPane.showMessageDialog(null, "Confirmed!", "Success", JOptionPane.INFORMATION_MESSAGE);
//		} else {
//			JOptionPane.showMessageDialog(null, "Error!", "failed", JOptionPane.ERROR_MESSAGE);
//		}
		String s = "ABCD12345HGBHUIKJ";
		String newS = "";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= '0' && c <= '9') {
				//System.out.print(c);
			} else {
				newS += c;
			}
		}
		System.out.println(newS.toLowerCase());
	}
}