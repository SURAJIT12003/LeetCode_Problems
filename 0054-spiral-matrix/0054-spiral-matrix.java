class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {

            // right

            for (int i = sc; i <= ec; i++) {
                ans.add(matrix[sr][i]);
            }

            sr++;

            // bottom
            for (int i = sr; i <= er; i++) {
                ans.add(matrix[i][ec]);
            }

            ec--;

            // left
            if (sr <= er) {
                for (int i = ec; i >= sc; i--) {
                    ans.add(matrix[er][i]);
                }
                er--;
            }
            // top

            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    ans.add(matrix[i][sc]);
                }

                sc++;
            }

        }

        return ans;
    }
}