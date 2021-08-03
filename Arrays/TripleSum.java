/*Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in 
the array sums up to 13.*/

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       int l;int r;
       Arrays.sort(A);
       
       for(int i=0;i<n-2;i++){
           l=i+1;
           r=n-1;
           while(l<r){
               if(A[i]+A[l]+A[r] == X){
                    return true;
               }
                else if(A[i]+A[l]+A[r] > X)
                    r--;
                else 
                    l++;
                
           }
       }
       return false;
    }
}