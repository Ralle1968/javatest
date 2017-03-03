import java.util.Arrays;

public class MagicArray {

	public static void main(String[] args) {
		int[][] arr = new int[][]  {{2,2,5,1},{5,6},{7,2,1}};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		int sum[] = new int [] {0};
		
		
		for (int x = 0; x < arr.length; x++) {
			int summe = 0;
			for (int y = 0; y < arr[x].length; y++) {
				summe += (arr[x][y]);	
			}
			System.out.println(summe);	
		}
		
		
	}

}
