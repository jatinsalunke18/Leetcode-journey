class Solution {
    public int largestInteger(int[] nums, int k) {
        int ans = -1;
        if(k==nums.length){
            for(int i=0;i<nums.length;i++) ans = Math.max(nums[i],ans);
            return ans;
        }
        if(k==1){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])==1) ans = Math.max(ans,nums[i]);
            }
            return ans;
        }
        int first = nums[0];
        int last = nums[nums.length-1];
        if(first==last) return -1;
        int freq1 = 1;
        int freq2 = 1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==first) freq1++;
            if(nums[i]==last) freq2++;
        }
        if(freq1==1 && freq2 == 1) return Math.max(first,last); 
        if(freq1!=1 && freq2==1) return last;
        if(freq1==1 && freq2!=1) return first;  
        return -1; 
    }
}