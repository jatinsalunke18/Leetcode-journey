class Solution {
    void func(int i,int k,int n,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(temp));
                return;
            }
        }
        if(i>9 || n<0) return;
        temp.add(i);
        func(i+1,k,n-i,ans,temp);
        temp.remove(temp.size()-1);
        func(i+1,k,n,ans,temp);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(1,k,n,ans,temp);
        return ans;
    }
}