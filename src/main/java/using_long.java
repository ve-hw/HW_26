
public class using_long {
	public static void main(String[]args) {
		final long start = System.nanoTime();
		int sum = 0;
		int max = 1000000000;
		for (long l = 0; l < max;  l++) {sum++;}
		final long finish = System.nanoTime();
	System.out.println("Using [long] " + max + " times, Elapsed time: " + (finish - start)/1_000_000.0 + " ms");

	}
}
