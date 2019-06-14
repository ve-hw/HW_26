
public class using_short {
	public static void main(String[]args) {
		final long start = System.nanoTime();
		int sum = 0;
		int max = 32767;
		for (short s = 0; s < max;  s++) {sum++;}
		final long finish = System.nanoTime();
	System.out.println("Using [short] " + max + " times, Elapsed time: " + (finish - start)/1_000_000.0 + " ms");

	}
}
