package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6,7,8,9};
		int num = 10;
		int res = binary(A, num, 0, A.length-1);
		System.out.println(res);
	}

	private static int binary(int[] a, int num, int start, int end) {
		if (start > end) return -1;
		int mid = (start + end)/2;
		if(a[mid] == num){
			return mid;
		}
		if(num < a[mid]){
			return binary(a, num, start, mid-1);
		}else {
			return binary(a, num, mid + 1, end);
		}
	}
}
