class Solution {
    public int change(int amount, int[] coins) {
       int[] prev=new int[amount+1];
        int n=coins.length;
    
    
    //Initializing base condition
    for(int i=0;i<=amount;i++){
        if(i%coins[0]==0)
            prev[i]=1;
        // Else condition is automatically fulfilled,
        // as prev array is initialized to zero
    }
    
    for(int ind=1; ind<n;ind++){
        int cur[]=new int[amount+1];
        for(int target=0;target<=amount;target++){
            int notTaken = prev[target];
            
            int taken = 0;
            if(coins[ind]<=target)
                taken = cur[target-coins[ind]];
                
            cur[target] = notTaken + taken;
        }
        prev = cur;
    }
    
    return prev[amount];
    }
}