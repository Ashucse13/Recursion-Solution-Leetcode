class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nu=new ArrayList<>();
        int f=1;
        for(int i=1;i<n;i++){
            f=f*i;
            nu.add(i);
        }
        nu.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans=ans+nu.get(k/f);
            nu.remove(k/f);
            if(nu.size()==0){
                break;
            }
            k=k%f;
            f=f/nu.size();
        }
        return ans;
    }
}