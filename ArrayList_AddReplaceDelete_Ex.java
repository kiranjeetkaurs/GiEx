import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList_AddReplaceDelete_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  add_ArrayList_100(); add_LinkedList_100(); add_ArrayList_1000();
		  add_LinkedList_1000(); add_ArrayList_10000(); add_LinkedList_10000();
		
		
		Delete_ArrayList_100();

		Delete_ArrayList_1000();
		Delete_ArrayList_10000();

		Delete_LinkedList_100();

		Delete_LinkedList_1000();
		Delete_LinkedList_10000();

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
	public static void Delete_ArrayList_10000() {
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10000; i++) {
			al.add(i, 10 + i);
		}

		long start_time = System.currentTimeMillis();
		al.clear();
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by ArrayList to Delete 10000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void Delete_LinkedList_10000() {
		LinkedList l = new LinkedList();
		for (int i = 0; i < 10000; i++) {
			l.add(i, 10 + i);
		}
		long start_time = System.currentTimeMillis();
		l.clear();
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by LinkedList to Delete 10000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void Delete_ArrayList_1000() {
		ArrayList al = new ArrayList();
		for (int i = 0; i < 1000; i++) {
			al.add(i, 10 + i);
		}

		long start_time = System.currentTimeMillis();
		al.clear();
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by ArrayList to Delete 1000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void Delete_LinkedList_1000() {
		LinkedList l = new LinkedList();
		for (int i = 0; i < 1000; i++) {
			l.add(i, 10 + i);
		}
		long start_time = System.currentTimeMillis();
		l.clear();
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by LinkedList to Delete 1000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void Delete_ArrayList_100() {
		ArrayList<Integer> al = new ArrayList();
		System.out.println("Al created with size" + al.size());
		for (int i = 0; i < 100; i++) {
			al.add(i, 10 + i);
			// System.out.println(i + ", " + al.get(i));
		}
		System.out.println("Al after adding" + al.size());

		long start_time = System.currentTimeMillis();
		System.out.println("Start_time" + start_time);
		System.out.println("before remooving" + al.size());

		al.clear();

		System.out.println("Size after remooving" + al.size());
		long end_time = System.currentTimeMillis();
		System.out.println("Start_time" + end_time);
		System.out
				.println("Time take by ArrayList to Delete 100 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}

	public static void Delete_LinkedList_100() {
		LinkedList l = new LinkedList();
		for (int i = 0; i < 100; i++) {
			l.add(i, 10 + i);
		}
		long start_time = System.currentTimeMillis();
		l.clear();
		long end_time = System.currentTimeMillis();

		System.out
				.println("Time take by LinkedList to Delete 1000 items:  "
						+ start_time + "  " + end_time + "  "
						+ (end_time - start_time));
	}
}
