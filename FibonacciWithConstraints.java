package Day1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class FibonacciWithConstraints {
	 public static void main(String[] args) {
	        int n,m;
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        m=sc.nextInt();
	        int arr[]=new int[m];
	        int f1=0,f2=1;
	        int sum=0;
	        for(int i=2;i<m;i++){
	            sum=f1+f2;
	            arr[i]=sum;
	            f1=f2;
	            f2=sum;
	        }
	        int temp=0;
	        if(n<=20&&m<=20){
	        for(int i=n-1;i<m;i++){
	            temp=arr[i]+temp;
	        }
	            System.out.println("The Sum of Fibonacci value is "+(float)temp);
	        }
	        else{
	            System.out.println("Invalid Input");
	        }
	}
}