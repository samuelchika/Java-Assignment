
public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f[][] = new int[2][3];
		f[0][0] = 1;
		f[0][1] = 3;
		f[0][2] = 2*f[0][0] + 1;
		f[1][0] = f[0][0] + f[0][2];
		f[1][1] = 2*f[1][0] + f[0][1];
		f[1][2] = (3*f[1][1]) - 2*f[0][2] - 5;
		System.out.println("Printng in Row");
		for(int i = 0; i < f.length; i++) {
			
			for(int j = 0; j < f[i].length; j++) {
				System.out.print(f[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Printng in Column");
				
		for(int i = 0; i < f[0].length; i++) {
			
			for( int j = 0; j < f.length; j++) {
				System.out.print(f[j][i] + " ");
			}
			System.out.println();
		}

	}

}
