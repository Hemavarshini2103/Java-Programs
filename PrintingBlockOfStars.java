package Day1;
import java.util.Scanner;
public class PrintingBlockOfStars {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("No.of stars: ");
	int s=sc.nextInt();
	System.out.print("No.of lines: ");
	int l=sc.nextInt();
	System.out.print("No.of blocks: ");
	int b=sc.nextInt();
	int line=0;
	for(int i=0;i<b;i++) {
		System.out.println("----BLOCK "+(i+1)+"----");
		for(int j=0;j<l-i;j++){
			System.out.print("Line "+(++line));
			for(int k=0;k<s;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println(s*(l-i));
		System.out.println();
}
}
}