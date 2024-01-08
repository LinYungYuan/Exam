public class RemoveDuplicates {
//26
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(removeDuplicates(new int[] { 1, 1, 2 }));
		removeDuplicates(new int[] { 1, 1, 2 });

	}

	public static int removeDuplicates(int[] nums) {

		int p = 0;
		int q = 1;
		while (q < nums.length) {

			if (nums[p] != nums[q]) {
				nums[p + 1] = nums[q];
				p++;
			}
			q++;
		}
		
		return p + 1;
	}
}
