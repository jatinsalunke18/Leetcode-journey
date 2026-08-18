class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = -1;
        for(int i=0;i<=nums.length-k;i++){
            for(int j=i;j<k+i;j++){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            }
        }
        for(int key:map.keySet()) System.out.println(key+" "+map.get(key));
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1) ans = Math.max(ans,nums[i]);
            if(nums.length==k) ans = Math.max(ans,nums[i]);
        }
        return ans;
    }
}