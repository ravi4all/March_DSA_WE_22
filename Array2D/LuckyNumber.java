import java.util.LinkedList;
import java.util.List;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}};
		List<Integer> minRow = new LinkedList<Integer>();
		List<Integer> maxCol = new LinkedList<Integer>();
		List<Integer> result = new LinkedList<Integer>();
		int minRowE = Integer.MAX_VALUE;
		int maxColE = Integer.MIN_VALUE;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				minRowE = Math.min(minRowE, matrix[i][j]);
			}
			minRow.add(minRowE);
			minRowE = Integer.MAX_VALUE;
		}
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				maxColE = Math.max(maxColE, matrix[j][i]);
			}
			maxCol.add(maxColE);
			maxColE = Integer.MIN_VALUE;
		}
		
		for(int each : minRow) {
			if(maxCol.contains(each)) {
				result.add(each);
			}
		}
		System.out.println(result);
		
	}

}
