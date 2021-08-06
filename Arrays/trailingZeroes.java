//User function Template for Java
class Solution{
    static int trailingZeroes(int N){
        // Write your code here
        if(N<0){
            return -1;
        }
        int count =0;
        for(int i=5;N/i>=1;i*=5){
            count+=N/i;
        }
        return count;
    }
}
