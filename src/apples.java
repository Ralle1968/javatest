import java.util.Scanner;
public class apples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = in.nextDouble();
		System.out.println("Enter second number: ");
		snum = in.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}

}
