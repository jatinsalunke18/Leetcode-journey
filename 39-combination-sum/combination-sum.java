class Solution {
    void func(int ind,int[] nums,int target,List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0 || ind==nums.length) return;
        temp.add(nums[ind]);
        func(ind,nums,target-nums[ind],ans,temp);
        temp.remove(temp.size()-1);
        func(ind+1,nums,target,ans,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp  = new ArrayList<>();
        func(0,candidates,target,ans,temp);
        return ans;
    }
}