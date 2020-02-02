

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[][] = new int[3][4];
		f[0][0] = 1;
		f[2][0] = 0;
		f[0][3] = 3;
		f[2][2] = 4;
		f[1][3] = 1;
		f[2][3] = -4;
		f[1][2] = 6;
		f[2][1] = 4;
		for(int j = 0; j < f.length; j++) {
			
			for(int i = 0; i < f[j].length; i++) {
				System.out.print(f[j][i] + " ");
			}
			System.out.println();
		}
	}

}
