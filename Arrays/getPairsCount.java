//User function Template for Java
/*Example 1
Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Input:
N = 4, X = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

*/

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
