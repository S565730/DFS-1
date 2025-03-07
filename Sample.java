
// PROBLEM-1
// Time Complexity :O(m * n)
// Space Complexity :O(m * n)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
class Solution

{ 

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor)

{ if (image[sr][sc] == newColor)

return image; 

int color = image[sr][sc]; 

dfs(image,sr,sc,newColor, color); 

return image; 

} 

private void dfs(int[][] image, int sr, int sc, int newColor, int color)

{ // base case 

if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) 

return; 

//logic 

image[sr][sc] = newColor; 

int [][] dirs = new int[][] 

{{0,1}, {1,0}, {-1,0}, {0,-1}}; 

for(int[] dir : dirs)

{ 

int r = sr + dir[0]; 

int c = sc + dir[1]; 

dfs(image, r , c, newColor, color); 

} 

}}


// PROBLEM-2
// Time Complexity :O(m * n)
// Space Complexity :O(m * n)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO




// Your code here along with comments explaining your approach
class Solution {

    public int[][] updateMatrix(int[][] matrix) {
    
    int m = matrix.length;
    // edge case
    
    if(matrix == null || m == 0) return matrix;
    
    int n = matrix[0].length;
    
    Queue <int []> q = new LinkedList<>();
    
    int [][] dirs = {{0,1}, {1,0}, {-1,0}, {0,-1}};
    
    for(int i = 0; i < m; i++){
    
    for(int j = 0; j < n; j++){
    
    if(matrix[i][j] == 0){
    
    q.add(new int [] {i, j});
    
    } else {
    
    matrix[i][j] = Integer.MAX_VALUE; //
    
    }
    
    }
    
    }
    
    while(!q.isEmpty()){
    
    
    
    int size = q.size();
    
    
    
    for(int k = 0; k < size; k++){
    
    
    
    int[] curr = q.poll();
    
    
    
    for(int [] dir : dirs){
    
    
    
    int r = dir[0] + curr[0];
    
    
    
    int c = dir[1] + curr[1];
    
    
    
    if(r >= 0 && r < m && c >= 0 && c < n && matrix[r][c] > matrix[curr[0]][curr[1]] + 1 ){
    
    
    q.add(new int[] {r,c});
    
    matrix[r][c] = matrix[curr[0]][curr[1]] + 1;
    
    }
    }
    
    }
    
    }
    
    return matrix;
    
    }
    
    }