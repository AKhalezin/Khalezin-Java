import java.util.Scanner; 

public class Task1 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		System.out.println ("Введите a и b:");
		int a = k.nextInt();
		int b = k.nextInt();
		if (a>b) {
		    System.out.println("a>b");
		}
		else if (a<b) {
		    System.out.println("a<b");
		}
		else {
		    System.out.println("a=b");
		}
		int plus=a+b;
		int minus=a-b;
		int mult=a*b;
		float div=(float)a/(float)b;
		System.out.println("a+b=" + plus);
		System.out.println("a-b=" + minus);
		System.out.println("a*b=" + mult);
		System.out.println("a/b=" + div);
	}
}