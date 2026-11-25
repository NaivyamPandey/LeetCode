class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int[] ans = new int[k];
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            return Integer.compare(a[1], b[1]);
        });
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0)
                    break;
                sum += mat[i][j];
            }
            int[] pair = new int[2];
            pair[0] = sum;
            pair[1] = i;
            pq.offer(pair);
        }
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}