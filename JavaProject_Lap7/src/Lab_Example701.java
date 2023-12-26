
public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12,50,93,45,75,52,80};
		for(int i=0;i<nums.length;i++) {
			System.out.println("num["+i+"]="+nums[i]);
			
		}
		System.out.println("using foreach to display vaiue of array ");
		int J=0;
		for(int _nums:nums) {
			System.out.println("num["+J+"]="+_nums);
			J++;	
		}
		printArraynumber(nums);

	}
	public static void printArraynumber(int[] number) {
		System.out.println("using foreach to display vaiue of array" );
		for (int i=0;i<number.length;i++) {
			System.out.println("num["+i+"]="+number[i]);
		}
	}

}
