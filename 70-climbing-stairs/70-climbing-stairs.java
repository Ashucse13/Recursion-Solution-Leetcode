class Solution {
    public int climbStairs(int n) {
        int pre=1;
        int cur=1;
        int temp=0;
        for(int i=1;i<n;i++){
            temp=cur;
            cur=cur+pre;
            pre=temp;
        }
        return cur;
    }
}