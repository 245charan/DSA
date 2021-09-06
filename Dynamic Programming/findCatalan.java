/*

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

#Algorithm:

Initialize dp[0]=1.
Catalan numbers at ith index are calculated using this formula with help of value at previous index in dp.
                       dp[i] = (((2*i)*(2*i-1)*dp[i-1])/(i*(i+1))); 

Return the nth catalan number (dp[n]).
For java:

Finding values of catalan numbers for N>80 is not possible even by using long in java, so use BigInteger.
*/

class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //using BigInteger to calculate large factorials.
        BigInteger b=new BigInteger("1");
        
        //calculating n!
        for(int i=1;i<=n;i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        
        //calculating n! * n!.
        BigInteger c=b;
        c=c.multiply(b);
        
        BigInteger d=new BigInteger("1");
        
        //calculating (2n)!.
        for(int i=1;i<=2*n;i++){
            d=d.multiply(BigInteger.valueOf(i));
        }
        
        //calculating (2n)! / (n! * n!).
        BigInteger ans=d.divide(c);
        
        //calculating (2n)! / ((n! * n!) * (n+1))
        ans=ans.divide(BigInteger.valueOf(n+1));
        
        //returning the nth catalan number.
        return ans;
    }
};
