
public class using_Byt {
	public static void main(String[] args) {
		final long start = System.nanoTime();
		Byte sum = 0;
		int max = 1_000_000_000;
		for (int b = 0; b < max; b++) {
			sum++;
		}
		final long finish = System.nanoTime();
		System.out.println("Using [Byte] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");

	}
}
