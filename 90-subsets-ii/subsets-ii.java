class Solution {
    void func(int ind,int[] nums,List<List<Integer>> ans,List<Integer> temp){
        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return; 
        }
        temp.add(nums[ind]);
        func(ind+1,nums,ans,temp);
        temp.remove(temp.size()-1);
        while(ind+1<nums.length && nums[ind]==nums[ind+1]) ind++;
        func(ind+1,nums,ans,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        func(0,nums,ans,temp);
        return ans;
    }
}