import java.util.ArrayList;
import java.util.List;

public class Day7_SpiralMatrix {
    public static List<Integer> spiralMatrix(int matrix[][]) {
        int sr = 0, sc = 0;
        int er = matrix.length - 1, ec = matrix[0].length - 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                res.add(matrix[sr][j]);
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                res.add(matrix[i][ec]);
            }
            // bottom
            for (int j = ec - 1; j >= sc; j--) {
                if (sr == er) {
                    break;
                }
                res.add(matrix[er][j]);
            }
            // left
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc == ec) {
                    break;
                }
                res.add(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return res;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralMatrix(matrix));
    }
}
