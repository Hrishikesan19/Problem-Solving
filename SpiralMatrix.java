import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int rowUpper = 0;
        int rowLower = n - 1;
        int colLeft = 0;
        int colRight = n - 1;

        while (rowUpper <= rowLower && colLeft <= colRight) {
            // left to right
            for (int i = colLeft; i <= colRight; i++) {
                result.add(arr[rowUpper][i]);
            }
            rowUpper++;
            // up to down
            for (int i = rowUpper; i <= rowLower; i++) {
                result.add(arr[i][colRight]);
            }
            colRight--;
            if (rowUpper <= rowLower) {
                // right to left
                for (int i = colRight; i >= colLeft; i--) {
                    result.add(arr[rowLower][i]);
                }
                rowLower--;
            }
            if (colLeft <= colRight) {
                // down to up
                for (int i = rowLower; i >= rowUpper; i--) {
                    result.add(arr[i][colLeft]);
                }
                colLeft++;
            }
        }
        System.out.println(result);
    }
}
