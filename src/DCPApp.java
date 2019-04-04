import java.util.Arrays;

public class DCPApp {

	public static void main(String[] args) {

		int[][] numPairs = { { 30, 75 }, { 0, 50 }, { 60, 150 } };
		int results = test(numPairs);
		System.out.println((Arrays.deepToString(numPairs)));
		System.out.println(results);
	}
	
	// returning inaccurate results due to comparing pairs multiple times
	private static int test(int[][] numPairs) {
		int results = 0;
		for (int[] pair : numPairs) {
			for (int i = 0; i < numPairs.length; i++) {
				if (pair[1] <= numPairs[i][0] && !numPairs[i].equals(pair)) 
					results--;
				if (pair[1] > numPairs[i][0] && !numPairs[i].equals(pair))
					results++;
			}
			for (int i = 0; i < numPairs.length; i++) {
				if (pair[0] <= numPairs[i][1] && !numPairs[i].equals(pair))
					results++;
				if (pair[0] > numPairs[i][1] && !numPairs[i].equals(pair))
					results--;
			}
		}
		return results;
	}

}

/*
 * Given an array of time intervals (start, end) for classroom lectures (possibly overlapping),
 * find the minimum number of rooms required.
 *
 * For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
*/