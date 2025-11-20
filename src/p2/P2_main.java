package p2;

public class P2_main {
	public static void main(String[] args) {
		int[]numbers = {2, 2, 2, 2};
		int max = 5, minIndex = 2;
		
		max = 0;
		minIndex = 0;
		for (int x = 0; x < numbers.length; x++) {
			if (numbers[x]> max) {
				max = numbers[x];
				minIndex = x;
			}
			
		}
		
		System.out.println("max ist " + max);
		System.out.println("minIndex ist " + minIndex);
		
		
	}

}
