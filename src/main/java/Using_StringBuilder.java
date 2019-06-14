
public class Using_StringBuilder {
	public static void main(String[] args) {
		final long start = System.nanoTime();
		StringBuilder sb = new StringBuilder("a");
		int max = 100_000;
		for (int i = 0; i < max; i++) {sb = sb.append("b");}
		final long finish = System.nanoTime();
		System.out.println("Using [StringBuilder] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");
	 }
}
