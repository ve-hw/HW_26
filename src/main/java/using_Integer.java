
public class using_Integer {
	public static void main(String[]args) {
		final long start = System.nanoTime();
		int sum = 0;
		int max = 1_000_000_000;
		for (Integer i = 0; i < max;  i++) {sum++;}
		final long finish = System.nanoTime();
	System.out.println("Using [Integer] " + max + " times, Elapsed time: " + (finish - start)/1_000_000.0 + " ms");

	}
}
