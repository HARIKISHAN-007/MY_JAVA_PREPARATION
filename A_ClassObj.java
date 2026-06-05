import java.util.Scanner;
class Add{
	int addition(int x,int y,int z){
		return x+y-z; 
	}
}
public class A_ClassObj{
	public static void main(String[] arg){ 
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		a = sc.nextInt();
		System.out.println("Enter second number");
		b = sc.nextInt();
		System.out.println("Enter third number");
		c = sc.nextInt();
		Add r = new Add();
		System.out.println("Addition of two numbers is : " + r.addition(a, b,c));
	} 
}