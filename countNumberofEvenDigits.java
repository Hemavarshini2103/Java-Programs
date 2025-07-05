package Day1;

import java.util.Scanner;

public class countNumberofEvenDigits {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int s=sc.nextInt();
	 int[] nums=new int[s];
	 for(int i=0;i<s;i++) {
		nums[i]=sc.nextInt();
	 }
	 countNumberofEvenDigits sol=new countNumberofEvenDigits();
	 int res1=sol.countEvenNumberOfDigitsMath(nums);
	 System.out.println(res1);
	 int res2=sol.countEvenNumberOfDigitsString(nums);
	 System.out.println(res2);
 }
 public int countEvenNumberOfDigitsMath(int[]nums) {
	 int count=0;
	 for(int num:nums) {
		 int digits=0;
		 int n = Math.abs(num); 
		 do {
			    digits++;
			     n =n/ 10;
			} while (n > 0);

		 if(digits%2==0) {
			 count++;
		 }
	 }
	 return count;
 }
 public int countEvenNumberOfDigitsString(int[] nums){
	 int count=0;
	 for(int num:nums) {
		 int n = Math.abs(num);
		 int digits=String.valueOf(n).length();
		 if(digits%2==0) {
			 count++;
		 }
	 }
	 return count;
 }
}
