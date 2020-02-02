//this print even indexes of the table
public class Exercise_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] f = new int[10][10];
		intiArray(f);
		printEvenPos(f);
	}
	public static void intiArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void printEvenPos(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(((i % 2) == 0) && ((j % 2) == 0)) {
					System.out.print("f["+ i + "][" + j + "] = " + arr[i][j] + " ");
				}
				
			}
			System.out.println();
		} 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(((i % 2) == 0) && ((j % 2) == 0)) {
					System.out.print(arr[i][j] + "  ");
				}
				
			}
			System.out.println();
		} 
	}

}
