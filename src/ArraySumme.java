
public class ArraySumme {

	public static void main(String[] args) {
		/*
		 * 4 2 0
		 * 9 5 2
		 * 1 0 0
		 */
		int[][] arr = new int[][] {{4,2},{9,5,2},{1}};
		
		int[] sum = new int[] {0};
		int summe = 0;
		
//		System.out.println(arr.length);
//		
//		System.out.println(arr[0].length);
//		System.out.println(arr[1].length);
//		System.out.println(arr[2].length);
//		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
		
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				System.out.println(arr[x][y]);
			}
			
		}
	
		
	}

}
