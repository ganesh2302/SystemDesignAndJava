package CodingPractice;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    static class Pair{
        public int x;
        public int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static int countIslands(int grid[][]){
        int vis[][] = new int[grid.length][grid[0].length];
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
              if(grid[i][j] ==1 && vis[i][j]==0){
                  cnt++;
                  bfs(i,j,grid,vis);
              }
            }
        }
        return cnt;
    }

    public static void bfs(int i, int j,  int grid[][], int vis[][]){
        Pair pair = new Pair(i,j);
        vis[i][j] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(pair);
        while(!q.isEmpty()){
            int row = q.peek().x;
            int col = q.peek().y;
            q.remove();
            for(int delrow=-1;delrow<=1;delrow++){
                for(int delcol=-1;delcol<1;delcol++){
                    int nrow = row+delrow;
                    int ncol = col+delcol;
                    if(nrow>=0 && nrow< grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol] ==1 && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
}
