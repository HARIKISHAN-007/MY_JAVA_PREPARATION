import java.util.Scanner;
class AddSub{
	int condition(int x,int y,int z){
		return x+y-z; 
	}
}
public class A_ClassObj{
	public static void main(String[] arg){ 
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		a = sc.nextInt();
		System.out.println("Enter second number :");
		b = sc.nextInt();
		System.out.println("Enter third number :");
		c = sc.nextInt();
		AddSub r = new AddSub();
		System.out.println("Final code : " + r.condition(a, b,c));
	} 
}
