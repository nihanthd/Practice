package maximumsubarray;

public class MaximumSubArray {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] array = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
//		Result[] maxsub = new Result[array.length];
		Result max = new Result();
		Result max_cur = new Result();
		max.sum = -1 * Integer.MAX_VALUE;
		max_cur.sum = max.sum;
		int n = array.length;
		for(int i = 0; i <= n-1; i++){
			if(max_cur.sum < 0){
				max_cur.sum = array[i];
				max_cur.i = i;
				max_cur.j = i;
			}else{
				max_cur.sum += array[i];
				max_cur.j = i;
			}
			if(max_cur.sum > max.sum){
				max = (Result) max_cur.clone();
			}
//			maxsub[i] = max;
		}
//		System.out.println(maxsub[n-1].sum + "," + maxsub[n-1].i + "," + maxsub[n-1].j);
		System.out.println(max.sum + "," + max.i + "," + max.j);
	}
}
