import java.util.Scanner;

public class RatingCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of touchdowns:");
		int TD = input.nextInt();
		System.out.print("Enter number of total yards:");
		double Yds = input.nextDouble();
		System.out.print("Enter number of Interceptions:");
		int INT = input.nextInt();
		System.out.print("Enter number of completions:");
		int Comp = input.nextInt();
		System.out.print("Enter number of passes attempted:");
		int ATT = input.nextInt();
		double a = (Comp/ATT -0.3)*5;
		double b = (Yds/ATT -3)*0.25;
		double c = (TD/ATT)*20;
		double d = 2.375-(INT/ATT*25);
		if (a<0)
			a = 0;
		else if (a> 2.375)
			a = 2.375;
		if (b<0)
			b = 0;
		else if (b> 2.375)
			b = 2.375;
		if (c<0)
			c = 0;
		else if (c> 2.375)
			c = 2.375;
		if (d<0)
			d = 0;
		else if (d> 2.375)
			d = 2.375;
		double rating = ((a+b+c+d)/6)*100;
		System.out.printf("your rating is:%.1f" , rating);
	}
}
