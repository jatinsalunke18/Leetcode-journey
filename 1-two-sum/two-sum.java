class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target-nums[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}