import java.util.*;

public class Using_Map {
	public static void main(String args[]) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		// Hashtable; LinkedHashMap; TreeMap
		
		// HashMap put
		long startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {hm.put(i, "Vlad E");}
		long endTime = System.nanoTime();
		System.out.println("HashMap puts: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// HashMap get
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {hm.get(i);}
		endTime = System.nanoTime();
		System.out.println("HashMap gets: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// HashMap remove
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {hm.remove(i);}
		endTime = System.nanoTime();
		System.out.println("HashMap remove: " + (endTime - startTime)/1_000_000.0 +" ms" + "\n");
		
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		
		// HashTable put
		for (int i = 0; i < 1_000_000; i++) {ht.put(i, "Vlad E");}
		System.out.println("HashTable puts: " + (endTime - startTime)/1_000_000.0 +" ms");
				
		// HashTable get
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {ht.get(i);}
		endTime = System.nanoTime();
		System.out.println("HashTable gets: " + (endTime - startTime)/1_000_000.0 +" ms");
				
		// HashTable remove
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {ht.remove(i);}
		endTime = System.nanoTime();
		System.out.println("HashTable remove: " + (endTime - startTime)/1_000_000.0 +" ms" + "\n");
		
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		// LinkedHashMap put
		for (int i = 0; i < 1_000_000; i++) {lhm.put(i, "Vlad E");}
		System.out.println("LinkedHashMap puts: " + (endTime - startTime)/1_000_000.0 +" ms");
				
		// LinkedHashMap get
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {lhm.get(i);}
		endTime = System.nanoTime();
		System.out.println("LinkedHashMap gets: " + (endTime - startTime)/1_000_000.0 +" ms");
				
		// LinkedHashMap remove
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {lhm.remove(i);}
		endTime = System.nanoTime();
		System.out.println("LinkedHashMap remove: " + (endTime - startTime)/1_000_000.0 +" ms" + "\n");
		
		Map<Integer, String> tm = new TreeMap<Integer, String>();
		
		// TreeMap put
		for (int i = 0; i < 1_000_000; i++) {tm.put(i, "Vlad E");}
		System.out.println("TreeMap puts: " + (endTime - startTime)/1_000_000.0 +" ms");
				
		// TreeMap get
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {tm.get(i);}
		endTime = System.nanoTime();
		System.out.println("TreeMap gets: " + (endTime - startTime)/1_000_000.0 +" ms");
				
		// TreeMap remove
		startTime = System.nanoTime();
		for (int i = 0; i < 1_000_000; i++) {tm.remove(i);}
		endTime = System.nanoTime();
		System.out.println("TreeMap remove: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		
	}
}
