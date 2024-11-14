// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int lim = Integer.parseInt(args[0]);
		double a = ( Math.random() * lim );
		double b = ( Math.random() * lim );
		double c = ( Math.random() * lim );
		double max = Math.max(a, b);
		double max1 = Math.max(max, c);
		double min = Math.min(a, b);
		double min1 = Math.min(min, c);
		double middle = a + b + c - min1 - max1;

		System.out.println( (int) max1 + " " + (int) middle + " " +(int) min1);
		System.out.println( (int) min1 + " " + (int) middle + " " +(int) max1);

	}
}
