class Solution {
    public List<String> ans = new ArrayList<>();
    public void func(int i,String s,int open,int close,int n,List<String> ans){
        if(open>n) return;
        if(open+close==2*n && open==close){
            ans.add(s);
            return;
        }
        func(i+1,s+"(",open+1,close,n,ans);
        if(open>close){
            func(i+1,s+")",open,close+1,n,ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        func(0,"",0,0,n,ans);
        return ans;
    }
}