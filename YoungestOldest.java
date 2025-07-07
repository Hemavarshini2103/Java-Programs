package Day1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class YoungestOldest {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        if (n < 0) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        int[] arr=new int[n];
	         boolean invalid = false;
	        for(int i=1;i<n;i++){
	            arr[i]=sc.nextInt();
	            if(arr[i]<0){
	                invalid=true;
	            }
	        }
	         if (invalid) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        int y=Integer.MAX_VALUE,o=Integer.MIN_VALUE;
	          for (int i = 1; i <n; i++) {
	            if (arr[i] < y) {
	                y = arr[i];
	            }
	            if (arr[i] > o) {
	                o = arr[i];
	            }
	        }

	        System.out.println("Youngest=" + y);
	        System.out.println("Oldest=" + o);
	        
	    }
}
