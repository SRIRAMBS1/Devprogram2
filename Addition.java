import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number :: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("Enter 2nd Number :: ");
		int b = Integer.parseInt(sc.nextLine());
		int c = a+b;
		System.out.println("");
		System.out.println("Addition of two numbers : : " +c);
	}
}

