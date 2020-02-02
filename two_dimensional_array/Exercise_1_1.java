
public class Exercise_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[][] = new int[10][12];
		
		intiArray(f);
		printArray(f);
	}
	public static void intiArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void printArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
