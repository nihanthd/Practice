/**
 * Class to print diagonals of an array.
 * @author Nihanth
 *
 */
public class ArrayDiagonalPrint {

	public static void main(String[] args) {
		//for initializing the array
		int[][] array = initializeArray(5,4);
//		prints right to left diagonal fashion
		for(int ymax = array[0].length-1; ymax >= 0; ymax--){
			System.out.println("--------------------------");
			int x = 0;
			int y = ymax;
			System.out.println(array[x++][y++]);
			while(x <= array.length-1 && y <= array[0].length-1){
				System.out.println(array[x++][y++]);
			}
		}
//		prints top to bottom diagonal fashion
		for(int xmin = 1; xmin <= array.length-1; xmin++){
			System.out.println("--------------------------");
			int x = xmin;
			int y = 0;
			System.out.println(array[x++][y++]);
			while(x <= array.length-1 && y <= array[0].length-1){
				System.out.println(array[x++][y++]);
			}
		}
	}

	private static int[][] initializeArray(int x, int y) {
		int k = 1;
		int[][] array = new int[x][y];
		for(int i = 0; i <= x-1; i++){
			for(int j = 0; j <= y-1; j++){
				array[i][j] = k++;
			}
		}
		return array;
	}

}
