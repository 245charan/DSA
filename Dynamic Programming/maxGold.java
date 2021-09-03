/*

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)

problem:
1.to the cell diagonally up towards the right ( / ) 
2.to the right( -> )
3.to the cell diagonally down towards the right ( \ )

Example 1:

Input: n = 3, m = 3
M = {{1, 3, 3},
     {2, 1, 4},
     {0, 6, 4}};
Output: 12
Explaination: 
The path is {(1,0) -> (2,1) -> (2,2)}.

Example 2:

Input: n = 4, m = 4
M = {{1, 3, 1, 5},
     {2, 2, 4, 1},
     {5, 0, 2, 3},
     {0, 6, 1, 2}};
Output: 16
Explaination: 
The path is {(2,0) -> (3,1) -> (2,2) 
-> (2,3)} or {(2,0) -> (1,1) -> (1,2) 
-> (0,3)}.

*/
class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int goldTable[][] = new int[n][m];
        for(int[] row:goldTable)
            Arrays.fill(row,0);
            
        for(int col = m-1;col>=0;col--){
            for(int row = 0; row < n; row++){
                int right = (col == m-1) ? 0 : goldTable[row][col+1];
                int right_up = (row == 0 || col == m-1) ? 0 : goldTable[row-1][col+1];
                int right_down = (row == n-1 || col == m-1) ? 0 : goldTable[row+1][col+1];
                
                goldTable[row][col] = M[row][col] + Math.max(right, Math.max(right_up,right_down));
            }
        }
        
        int res = goldTable[0][0];
        
        for(int i = 1;i<n;i++)
            res = Math.max(res,goldTable[i][0]);
        
        return res;
    }
}
