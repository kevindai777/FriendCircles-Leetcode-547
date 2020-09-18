//Java Solution

class Solution {
    public int findCircleNum(int[][] M) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < M.length; i++) {
            if (!set.contains(i)) {
                dfs(i, set, M);
                count++;
            }
        }
        
        return count;
    }
    
    public void dfs(int i, Set set, int[][] M) {
        for (int j = 0; j < M[i].length; j++) {
            if (M[i][j] == 1 && !set.contains(j)) {
                set.add(j);
                dfs(j, set, M);
            }
        }
    }
}