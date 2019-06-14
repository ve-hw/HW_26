
public class using__Long {
	public static void main(String[]args) {
		final long start = System.nanoTime();
		int sum = 0;
		int max = 1000000000;
		for (Long l = (long)0; l < max;  l++) {sum++;}
		final long finish = System.nanoTime();
	System.out.println("Using [Long] " + max + " times, Elapsed time: " + (finish - start)/1_000_000.0 + " ms");

	}
}
