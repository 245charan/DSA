class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long minDiff = Long.MAX_VALUE;
        for(int i =0;i+m-1<n;i++){
            minDiff = Math.min(a.get(i+(int)m-1)-a.get(i),minDiff);
        }
        return minDiff;
    }
}
/**
    => Sort the array and Initialize a varible to store the minDiff.
    => Traverse the array with the condition i+m-1.
    => Check the minimum difference and update the minDiff
*/
