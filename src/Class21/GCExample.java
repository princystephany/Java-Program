package Class21;

public class GCExample {

	public static void main(String[] args) {
		int arr1[] = { 0, 1, 2, 3, 4, 5 };// source
		int arr2[] = { 100, 10, 20, 30, 40, 50 };// destination

		// copies an array from the specified source array
		System.arraycopy(arr1, 0, arr2, 1, 4);
		System.out.println("array2 = " + arr2[0] + " " + arr2[1]);

		for (int i = 0; i < arr1.length; i++) {
			System.out.print("  " + arr1[i]);
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("  " + arr2[i]);
		}
		System.out.println();
		// it runs the GarbageCollector
		System.gc();
		System.out.println("Cleanup completed...");

	}

}