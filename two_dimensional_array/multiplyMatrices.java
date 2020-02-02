
public class multiplyMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[2][3];
		int[][] b = new int[3][2];
		intiArray(a);
		intiArray(b);
		multiplyMatrix(a,b);
		
	}
	public static void intiArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 100);
			}
		}
	}
	public static void multiplyMatrix(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				c[i][j] = matrixElementMultiply(a, b, i, j);
			}
		}
		System.out.println("Matric A");
		printArrays(a);
		System.out.println();
		System.out.println("Matric B");
		printArrays(b);
		System.out.println();
		System.out.println("Matric C = A * B");
		printArrays(c);
	}
	
	public static int matrixElementMultiply(int[][] a, int[][] b, int i, int j) {
		int sum = 0;
		for(int k = 0; k < a.length; k++) {
			sum += a[i][k] + b[i][k];
		}
		return sum;
	}
	public static void printArrays(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j  < arr[i].length; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
