package h2;

public class H2_main {
	public static void main(String[] args) {
		
		int n = 469956, digits = 6;
		int []a= {0,0,0,0,0,0,0,0,0};
		
		String s = String.valueOf(n);
		digits = s.length();
	
		System.out.print("Anzahl Digits: " + digits);
		System.out.println();
	
	
		
		for (int i = 8; i > 8 - digits; i--) {
			a[i] = n % 10;
			n = n/10;
		}
		System.out.println("Array a: ");
		for (int x = 0; x<9; x++) {
			System.out.print(a[x] + " ");
			
			
		}
		}
	}


