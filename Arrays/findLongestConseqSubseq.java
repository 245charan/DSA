//Function to return length of longest subsequence of consecutive integers. in TC - O(n), SC - O(n)
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> s = new HashSet<Integer>();
	   for(int num: arr){
	       s.add(num);
	   }
	   
	   int longestStreak = 0;
	   for(int num : arr ){
    	   if(!s.contains(num-1)){
    	       int CurrentStreak = 1;
    	       while(s.contains(num+1)){
    	           CurrentSteak++;
    	           num+=1;
    	       }
    	       longestStreak = Math.max(longestStreak,CurrentStreak);
	      }
	   }
	   return longestStreak;
	}


/**
	=> Use a Hashset to insert whole array.
	=> Maintain a counter longestStresk to store longest Consecutive Sequence length.
	=> Traverse through the array, only if curr value i.e num-1 is not contains in Hashset
	   then check for curr value plus one  i.e num+1 is present in Hashset or not, loop it
	   until the condition fails .
	=> If num+1 is present in Hashset then incremnt the value of CurrentStreak, which is 
	   already declared and initialized with 1 before even entering into loop.
	=> Update the longestStreak with max of longestStreak or CurrentStreak.
	=> return longestConseqSubset
	   
	    
**/
