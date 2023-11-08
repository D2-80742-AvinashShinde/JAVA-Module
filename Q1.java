import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		a=sc.nextInt();
		System.out.println("Given Number : "+a);
		System.out.println("Binary Equivalent :"+Integer.toBinaryString(a));
		System.out.println("Octal Equivalent :"+Integer.toOctalString(a));
		System.out.println("Hexa Decimal :"+Integer.toHexString(a));
		}
	}
