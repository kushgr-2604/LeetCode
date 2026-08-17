class Solution {
          private static final int[][] DIR = {
    {-1, 0},
    {1, 0},
    {0, -1},
    {0, 1}
};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m =grid.size();
        int n = grid.get(0).size();

        int[][] best = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(best[i], -1);
        }
        int startHealth = health - grid.get(0).get(0);
        if (startHealth <= 0) return false;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        pq.offer(new int[]{startHealth, 0, 0});
        best[0][0] = startHealth;

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int remHealth = cur[0];
            int x = cur[1];
            int y = cur[2];

            if (x == m - 1 && y == n - 1) {
                return true;
            }

            if (remHealth < best[x][y]) continue;

            for (int[] d : DIR) {
                int nx = x + d[0];
                int ny = y + d[1];

                if (nx < 0 || nx >= m || ny < 0 || ny >= n)
                    continue;

                int newHealth = remHealth - grid.get(nx).get(ny);

                if (newHealth > 0 && newHealth > best[nx][ny]) {
                    best[nx][ny] = newHealth;
                    pq.offer(new int[]{newHealth, nx, ny});
                }
            }
        }

        return false;
    }
}