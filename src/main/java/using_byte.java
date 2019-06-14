
public class using_byte {
	public static void main(String[]args) {
		final long start = System.nanoTime();
		int sum = 0;
		int max = 127;
		for (byte b = 0; b < max;  b++) {sum++;}
		final long finish = System.nanoTime();
	System.out.println("Using [byte] " + max + " times, Elapsed time: " + (finish - start)/1_000_000.0 + " ms");

	}
}
