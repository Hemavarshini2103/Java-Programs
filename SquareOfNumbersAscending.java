package Day1;
import java.util.Arrays;
import java.util.Scanner;
public class SquareOfNumbersAscending  {
	 public static int[] find(int[] nums) {
	int n=nums.length;
	int[] result = new int[n];
    int left = 0, right = n - 1;
    int pos = n - 1;

    while (left <= right) {
        int leftSquare = nums[left] * nums[left];
        int rightSquare = nums[right] * nums[right];

        if (leftSquare > rightSquare) {
            result[pos] = leftSquare;
            left++;
        } else {
            result[pos] = rightSquare;
            right--;
        }
        pos--;
    }
    return result;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int s=sc.nextInt();
	 int[] nums=new int[s];
	 for(int i=0;i<s;i++) {
		 nums[i]=sc.nextInt();
		 
	 }
	 int[] result = find(nums);
	 System.out.println(Arrays.toString(result));
}
}