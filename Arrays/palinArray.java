public static boolean isPalidrome(int n){
        int num=n,res=0;
        while(num>0){
            res=num%10+res*10;
            num=num/10;
            
        }
        return res==n;
    }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  boolean b[]=new boolean[n];
                  for(int i=0;i<n;i++){
                      b[i]= GfG.isPalidrome(a[i]);
                      if(b[i]==false) 
                      return 0; 
                      
                  } return 1;
           }
