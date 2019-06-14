import java.util.*;
public class Using_List {
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> vector = new Vector<Integer>();
	
		// ArrayList add
		long startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {arrayList.add(i);}
		long endTime = System.nanoTime();
		System.out.println("ArrayList add: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// LinkedList add
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {linkedList.add(i);}
		endTime = System.nanoTime();
		System.out.println("LinkedList add: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// Vector add
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {vector.add(i);}
		endTime = System.nanoTime();
		System.out.println("Vector add: " + (endTime - startTime)/1_000_000.0 +" ms" + "\n");
		
		// ArrayList get
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {arrayList.get(i);}
		endTime = System.nanoTime();
		System.out.println("ArrayList get: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// LinkedList iterate all
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {linkedList.get(i);}
		endTime = System.nanoTime();
		System.out.println("LinkedList get: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// Vector get
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {vector.get(i);}
		endTime = System.nanoTime();
		System.out.println("Vector get: " + (endTime - startTime)/1_000_000.0 +" ms" + "\n");
		
		// ArrayList remove
		startTime = System.nanoTime();
		
		for (int i = 9999; i >= 0; i--) {arrayList.remove(i);}
		endTime = System.nanoTime();
		System.out.println("ArrayList remove: " + (endTime - startTime)/1_000_000.0 +" ms");
	
		// LinkedList remove
		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {linkedList.remove(i);}
		endTime = System.nanoTime();
		System.out.println("LinkedList remove: " + (endTime - startTime)/1_000_000.0 +" ms");
		
		// Vector remove
		startTime = System.nanoTime();
		for (int i = 9999; i >= 0; i--) {vector.remove(i);}
		endTime = System.nanoTime();
		System.out.println("Vector remove: " + (endTime - startTime)/1_000_000.0 +" ms");
		}
}
