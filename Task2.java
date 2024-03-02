import java.util.Scanner; 

public class Task2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println ("Введите две строки:");
	    String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.equals(b)) {
            System.out.println ("Строки идентичны.");
        }
	    else System.out.println ("Строки неидентичны.");
	}
}