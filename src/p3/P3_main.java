package p3;

public class P3_main {
	public static void main(String[] args) {
		int[][] M = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int x = 0; x < 3; x++) { //Erster for-loop durch Zeile
			for (int y = 0; y < 3; y++) { //Zweiter for-loop durch Spalte
				M[x][y]++;
				System.out.print(M[x][y] + " ");
			}
			System.out.println();
		}

		System.out.println();
		int Summe = 0;
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				Summe = Summe + M[x][y];
			}
		}
		System.out.print("Die Summe ist " + Summe);
		System.out.println();
		
		
		// neue Matrix B machen von der Größe 
		// Spalten werden Zeilenindexe
		// Zeilen Spaltenindex 2-i
		
		}
		
		
	}


