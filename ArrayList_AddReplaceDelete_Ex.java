import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList_AddReplaceDelete_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  add_ArrayList_100(); add_LinkedList_100(); add_ArrayList_1000();
		  add_LinkedList_1000(); add_ArrayList_10000(); add_LinkedList_10000();
		
		
		

	}

	public static void add_ArrayList_100() {
		ArrayList al = new ArrayList();

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			al.add(i, 10 + i);
		}
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by ArrayList to add items:  " + start_time
						+ "  " + end_time + "  " + (end_time - start_time));
	}

	public static void add_LinkedList_100() {
		LinkedList l = new LinkedList();

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			l.add(i, 100 + i);
		}
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by LinkedList to add items:  " + start_time
						+ "  " + end_time + "  " + (end_time - start_time));
	}

	public static void add_ArrayList_1000() {
		ArrayList al = new ArrayList();

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			al.add(i, 100 + i);
		}
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by ArrayList to add 1000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void add_LinkedList_1000() {
		LinkedList l = new LinkedList();

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			l.add(i, 100 + i);
		}
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by LinkedList to add 1000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void add_ArrayList_10000() {
		ArrayList al = new ArrayList();

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			al.add(i, 100 + i);
		}
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by ArrayList to add 10000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void add_LinkedList_10000() {
		LinkedList l = new LinkedList();

		long start_time = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			l.add(i, 100 + i);
		}
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by LinkedList to add 10000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	// ////////////////////////////////////////////////////////////////////////////////Delete/////////////////////////////////////
}