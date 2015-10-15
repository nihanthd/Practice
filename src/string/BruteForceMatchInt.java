package string;

public class BruteForceMatchInt {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,3,2,3,4,2,5,5,8,7};
		int[] b = {1,2,3,4,3,2,3,4,2,5,5};
		int res = bruteForceStringMatch(a, a.length, b, b.length);
		System.out.println(res);
	}

	private static int bruteForceStringMatch(int[] a, int n, int[] b,
			int m) {
		for(int i = 0; i < n-m; i++){
			int j = 0;
			while(j < m && (a[i+j] == b[j])){
				j++;
			}
			if(j==m){
				return 1;
			}
		}
		return -1;
	}

}
