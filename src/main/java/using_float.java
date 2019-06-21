
public class using_float {
	public static void main(String[] args) {

		final long start = System.nanoTime();
		float sum = 0.0f;
		int max = 1_000_000_000;
		for (int s = 0; s < max; s++) {
			sum++;
		}
		final long finish = System.nanoTime();
		System.out.println("Using [float] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");

	}
}
