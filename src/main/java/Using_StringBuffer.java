
public class Using_StringBuffer {
	public static void main(String[] args) {
		final long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("a");
		int max = 100_000;
		for (int i = 0; i < max; i++) {sb = sb.append("b");}
		final long finish = System.nanoTime();
		System.out.println("Using [StringBuffer] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");
	 }
}
