package Day1;
import java.util.*;

public class maxConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        for(int j=0;j<3;j++) {
        System.out.println("Array: "+(j+1));
        System.out.println("Enter size of the array :");
		int s=sc.nextInt();
		System.out.println("Size of the array: "+s);
		int [] nums=new int[s];
		for(int i=0;i<s;i++) {
			nums[i]=sc.nextInt();
		}
		int res=findMaxConsecutiveOnes(nums);
		System.out.println(res);
		System.out.println();
	}
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count=0,maxCount=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count++;
				if(count>maxCount) {
					maxCount=count;
				}
			}
			else {
				count=0;
			}
		}
		return maxCount;
	}

}
