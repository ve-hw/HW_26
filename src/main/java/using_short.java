
public class using_short {

	public static void main(String[] args) {

		final long start = System.nanoTime();
		short sum = 0;
		int max = 1_000_000_000;
		for (int s = 0; s < max; s++) {
			sum++;
		}
		final long finish = System.nanoTime();
		System.out.println("Using [short] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");

	}
}
