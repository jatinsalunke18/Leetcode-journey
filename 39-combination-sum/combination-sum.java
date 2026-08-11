class Solution {
    public static void recursion(int i,int target,int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(i == nums.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
                return;
            }
            return;
        }


        if(target - nums[i] >= 0){
            list.add(nums[i]);
            recursion(i,target - nums[i],nums,list,ans);
            list.remove(list.size() - 1);
        }
        recursion(i+1,target,nums,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recursion(0,target,nums,list,ans);
        return ans;
    }
}