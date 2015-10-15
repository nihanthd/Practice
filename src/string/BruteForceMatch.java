package string;

public class BruteForceMatch {

	public static void main(String[] args) {
		String main = "Nihanth";
		char[] a = main.toCharArray();
		String sub = "ihan";
		char[] b = sub.toCharArray();
		int res = bruteForceStringMatch(a, a.length, b, b.length);
		System.out.println(res);
	}

	private static int bruteForceStringMatch(char[] a, int n, char[] b,
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
