//Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> s = new HashSet<Integer>();
	   for(int num: arr){
	       s.add(num);
	   }
	   
	   int longestSteak = 0;
	   for(int num : arr ){
    	   if(!s.contains(num-1)){
    	       int nextVal = num;
    	       int CurrentSteak = 1;
    	       while(s.contains(nextval+1)){
    	           CurrentSteak++;
    	           nextval+=1;
    	       }
    	       longestSteak = Math.max(longestSteak,CurrentSteak);
	      }
	   }
	   return longestSteak;
	}
