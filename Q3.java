
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int choice;
		int Total=0;
		int P9 = 0;int P8=0;int P7=0;int P6=0;int P5=0;int P4=0;int P3=0;int P2=0;int P1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("0.EXIT              ");
		System.out.println("1.DOSA          50Rs");
		System.out.println("2.Samosa        15Rs");
		System.out.println("3.Idli          30Rs");
		System.out.println("4.Dhokla        35Rs");
		System.out.println("5.Jalebi Bai    25Rs");
		System.out.println("6.Kachori       15Rs");
		System.out.println("7.Sev Puri      20Rs");
		System.out.println("8.VadaPAV       15Rs");
		System.out.println("9.Pani Puri     20Rs");
		System.out.println("10.Generate Bill    ");
		System.out.println("Enter Your Choice ");
		choice =sc.nextInt();
		while(choice!=0) {
		switch(choice)
		{
		case 0:
			System.out.println("Thank You Visit Again");
			break;
		case 1:
			int n1;
			System.out.println("Enter Quantity");
			n1=sc.nextInt();
			P1=50*n1;
			break;
		case 2:
			int n2;
			System.out.println("Enter Quantity");
			n2=sc.nextInt();
			P2=15*n2;	
			break;
		case 3:
			int n3;
			System.out.println("Enter Quantity");
			n3=sc.nextInt();
			P3=50*n3;
			break;
		case 4:
			int n4;
			System.out.println("Enter Quantity");
			n4=sc.nextInt();
			P4=50*n4;
			break;
		case 5:
			int n5;
			System.out.println("Enter Quantity");
			n5=sc.nextInt();
			P5=50*n5;
			break;
		case 6:
			int n6;
			System.out.println("Enter Quantity");
			n6=sc.nextInt();
			P6=50*n6;
			break;
		case 7:
			int n7;
			System.out.println("Enter Quantity");
			n7=sc.nextInt();
			P7=50*n7;
			break;
		case 8:
			int n8;
			
			System.out.println("Enter Quantity");
			n8=sc.nextInt();
			P8=50*n8;
			break;
		case 9:
			int n9;
			
			System.out.println("Enter Quantity");
			n9=sc.nextInt();
			P9=50*n9;	
			break;
		case 10:
			Total = P1 + P2 + P3 + P4 + P5 + P6 + P7 + P8 + P9;
			System.out.println("Total = "+Total);
		}
		
		}
		
	}

}
