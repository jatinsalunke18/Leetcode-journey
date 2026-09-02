class Solution {
    void func(int ind,int nums[],List<List<Integer>> ans,List<Integer> temp){
        if(ind == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        func(ind+1,nums,ans,temp);
        temp.add(nums[ind]);
        func(ind+1,nums,ans,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(0,nums,ans,temp);
        return ans;
    }
}