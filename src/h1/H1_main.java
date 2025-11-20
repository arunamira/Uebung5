package h1;

public class H1_main {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 29, -5, 7 };

		int[] dummy = new int[myArray.length];

		for (int x = 0; x < myArray.length; x++) {
			dummy[x] = myArray[dummy.length - 1 - x];
		}

		myArray = dummy;

		for (int y = 0; y < myArray.length; y++) {
			System.out.print(myArray[y] + " ");
		}

	}

}
