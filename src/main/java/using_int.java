
public class using_int {
	public static void main(String[]args) {
		final long start = System.nanoTime();
		int sum = 0;
		int max = 1_000_000_000;
		for (int i = 0; i < max;  i++) {sum++;}
		final long finish = System.nanoTime();
	System.out.println("Using [int] " + max + " times, Elapsed time: " + (finish - start)/1_000_000.0 + " ms");

	}
}
