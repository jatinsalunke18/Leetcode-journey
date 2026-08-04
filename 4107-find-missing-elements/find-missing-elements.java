class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int num:nums){
            low = Math.min(num,low);
            high= Math.max(num,high);
        } 
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(low<=high){
            if(nums[i]==low){
                low++;
                i++;
            }
            else ans.add(low++);
        }
        return ans;
    }
}