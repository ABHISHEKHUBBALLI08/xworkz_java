public class MultiDArrayZero {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        int[][] temp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][j] = num[i][j];
            }
        }
        boolean[] row = new boolean[3];
        boolean[] col = new boolean[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (num[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (row[i] || col[j]) {
                    temp[i][j] = 0;
                }
            }
        }
        System.out.println("Modified Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
