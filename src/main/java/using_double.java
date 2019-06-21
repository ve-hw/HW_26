
public class using_double {
	public static void main(String[] args) {

		final long start = System.nanoTime();
		double sum = 0.0;
		int max = 1_000_000_000;
		for (int s = 0; s < max; s++) {
			sum++;
		}
		final long finish = System.nanoTime();
		System.out.println("Using [double] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");

	}
}
