/*Input : arr[] = {2, 1, 8}
Output : 1
Left smaller  LS[] {0, 0, 1}
Right smaller RS[] {1, 0, 0}
Maximum Diff of abs(LS[i] - RS[i]) = 1 

Input  : arr[] = {2, 4, 8, 7, 7, 9, 3}
Output : 4
Left smaller   LS[] = {0, 2, 4, 4, 4, 7, 2}
Right smaller  RS[] = {0, 3, 7, 3, 3, 3, 0}
Maximum Diff of abs(LS[i] - RS[i]) = 7 - 3 = 4 

Input : arr[] = {5, 1, 9, 2, 5, 1, 7}
Output : 1
*/





class Solution{
    public:
    /*You are required to complete this method */
    int findMaxDiff(int A[], int n)
    {
      stack <int> stk;
  int LS[n];
  int RS[n];
  for(int i=0; i<n; i++)
  {
     while(!stk.empty() && stk.top()>=A[i])
          {             
              stk.pop();
          }
         if(stk.empty()){LS[i]=0;}
         else
         {LS[i]=stk.top();}
         stk.push(A[i]);
  }
  //for(int i=0; i<n; i++){cout<<LS[i]<<" ";} cout<<endl;
  
  //while(!stk.empty()){stk.pop();}
   stack<int> stk1;
  for(int i=0; i<n; i++)
  {
     while(!stk1.empty() && stk1.top()>=A[n-i-1])
          {             
              stk1.pop();
          }
         if(stk1.empty()){RS[n-i-1]=0;}
         else
         {RS[n-i-1]=stk1.top();}
         stk1.push(A[n-i-1]);
  }
  //for(int i=0; i<n; i++){cout<<RS[i]<<" ";}
  int res=0;
  for(int i=0; i<n; i++)
  {res= max(res,(abs(LS[i]-RS[i])));}
  return res;
    }
};
