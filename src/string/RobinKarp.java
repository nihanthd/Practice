package string;

public class RobinKarp {
	static int primeNumber = 101;

	public static void main(String[] args) {
		String original = "abcd", matching = "bcd";
		int result = rabinKarpStringMatching(original, matching);
		System.out.println(result);
	}

	/**
	 * base old hash old 'a' new 'a' hash("bra") = [101 × (999,509 - (97 ×
	 * 101^2))] + (97 × 101^0) = 1,011,309
	 * 
	 * @param a
	 * @param oldHash
	 * @param oldChar
	 * @param newChar
	 * @return
	 */
	private static long rollingHash(int length, long oldHash, char oldChar,
			char newChar) {
		long newHash = (primeNumber * (oldHash - ((long) oldChar)
				* (long) Math.pow(primeNumber, length - 1)))
				+ (long) newChar;
		return newHash;
	}

	/**
	 * ASCII a = 97, b = 98, r = 114. hashOfString("abr") = (97 × 101^2) + (98 ×
	 * 101^1) + (114 × 101^0) = 999,509
	 * 
	 * @param string
	 * @return
	 */
	private static long hashOfString(String string) {
		long hash = 0;
		for (int i = string.length() - 1, j = 0; i >= 0; i--, j++) {
			hash = hash
					+ ((long) string.charAt(i) * (long) Math
							.pow(primeNumber, j));
		}
		return hash;
	}

	/**
	 *This method is the implementation of Rabin-Karp String matching algorithm. 
	 * @param original
	 * @param matching
	 * @return
	 */
	private static int rabinKarpStringMatching(String original, String matching) {
		int matchingLength = matching.length();
		int originalLength = original.length();
		long matchingHash = hashOfString(matching);
		long partialHash = 0;
		for (int i = 0; i < originalLength - matchingLength + 1; i++) {
			if (i == 0) {
				partialHash = hashOfString(original.substring(i, i
						+ matchingLength));
			} else {
				partialHash = rollingHash(matchingLength, partialHash,
						original.charAt(i - 1),
						original.charAt(i + matchingLength - 1));
			}
			if (partialHash == matchingHash) {
				return BruteForceMatch.bruteForceStringMatch(original
						.substring(i, i + matchingLength).toCharArray(),
						matching.toCharArray());
			}
		}
		return -1;
	}

}
