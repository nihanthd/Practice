package string;

public class BruteForceMatch {

	public static void main(String[] args) {
		String main = "Nihanth";
		char[] a = main.toCharArray();
		String sub = "ihan";
		char[] b = sub.toCharArray();
		int res = bruteForceStringMatch(a, b);
		System.out.println(res);
	}

	public static int bruteForceStringMatch(char[] a, char[] b) {
		int n = a.length, m = b.length;
		for(int i = 0; i < n - m + 1; i++){
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
