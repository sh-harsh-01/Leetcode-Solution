class Solution {
    class Pair{
        int i;
        int j;
        public Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int c=0;
        boolean [][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] =='1' && vis[i][j]==false){
                    bfs(grid,vis,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public void bfs(char [][] grid, boolean [][]vis, int row, int col){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        // Pair p = ;
        // p.i = row;
        // p.j = col;
        q.offer(new Pair(row,col));

        while(!q.isEmpty()){
            Pair pair = q.poll();
            int i = pair.i;
            int j = pair.j;

            // up
            if(i-1>=0 && grid[i-1][j]=='1' && vis[i-1][j] ==false){
                q.offer(new Pair(i-1,j));
                vis[i-1][j] = true;
            }
            // down
            if(i+1<n && grid[i+1][j]=='1' && vis[i+1][j] ==false){
                q.offer(new Pair(i+1,j));
                vis[i+1][j] = true;
            }
            // left
            if(j-1>=0 && grid[i][j-1]=='1' && vis[i][j-1] ==false){
                q.offer(new Pair(i,j-1));
                vis[i][j-1] = true;
            }
            // right
            if(j+1<m && grid[i][j+1]=='1' && vis[i][j+1] ==false){
                q.offer(new Pair(i,j+1));
                vis[i][j+1] = true;
            }
        }
    }
}