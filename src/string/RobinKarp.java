package string;


public class RobinKarp {
	static int primeNumber = 101;

	public static void main(String[] args) {
		String a = "abr";
		char oldChar = 'a', newChar = 'a';
		long oldHash = hashOfString(a) ;
		System.out.println(rollingHash(a, oldHash,  oldChar,  newChar));
		a = a.substring(1, a.length());
		a = a + newChar;
		System.out.println(a);
	}

	/**
	 * 				  base   old hash    old 'a'         new 'a'
	 * hash("bra") = [101 × (999,509 - (97 × 101^2))] + (97 × 101^0) = 1,011,309
	 * @param a
	 * @param oldHash
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	private static long rollingHash(String a, long oldHash, char oldChar,
			char newChar) {
		long newHash = (primeNumber * (oldHash - ((long)oldChar)* (long)Math.pow(primeNumber, a.length()-1))) + (long)newChar;
		return newHash;
	}
	
	/**
	 * ASCII a = 97, b = 98, r = 114. 
	 * hashOfString("abr") = (97 × 101^2) + (98 × 101^1) + (114 × 101^0) = 999,509 
	 * @param string
	 * @return
	 */
	private static long hashOfString(String string){
		long hash = 0;
		for(int i = string.length()-1, j = 0; i >= 0; i--, j++){
			hash = hash + ((long)string.charAt(i) * (long)Math.pow(primeNumber, j));
		}
		return hash;
	}

}
