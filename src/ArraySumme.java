
public class ArraySumme {

	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{4,2},{9,5,2},{1}};
		
		
		int summe = 0;
		

		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				summe += (arr[x][y]);
			}
			
		}
	
		System.out.println(summe);
	}

}
