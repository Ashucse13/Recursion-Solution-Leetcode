class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        pal(0,s,path,ans);
        return ans;
    }
    void pal(int idx,String s,List<String>path,List<List<String>>ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();++i){
            if(isPal(s,idx,i)){
            path.add(s.substring(idx,i+1));
            pal(i+1,s,path,ans);
            path.remove(path.size()-1);
        }
    }
    }
    boolean isPal(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}