class Solution {
    void func(int ind,int[] nums, HashSet<List<Integer>> ans,List<Integer> temp){
        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        func(ind+1,nums,ans,temp);
        temp.add(nums[ind]);
        func(ind+1,nums,ans,temp);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        func(0,nums,ans,temp);
        return new ArrayList<>(ans);
    }
}