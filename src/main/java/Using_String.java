public class Using_String {
	
	public static void main(String[] args) {
		final long start = System.nanoTime();
		String s = "a";
		int max = 100_000;
		for (int i = 0; i < max; i++) {s = s.concat("b");}
		final long finish = System.nanoTime();
		System.out.println("Using [String] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");
	 }
}
