class Solution {
    int sum(List<Integer> list){
        int sum = 0;
        for(int num:list)sum+=num;
        return sum;
    }
    void func(int ind,int[] nums,int target,List<List<Integer>> ans,List<Integer> temp){
        int sum = sum(temp);
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target || ind==nums.length) return;
        temp.add(nums[ind]);
        func(ind,nums,target,ans,temp);
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