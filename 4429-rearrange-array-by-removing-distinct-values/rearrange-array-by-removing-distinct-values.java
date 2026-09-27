class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp[] = new int[101];
        int ans[] = new int[nums.length];
        int max = 0;
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
            max = Math.max(max,temp[nums[i]]);
        }
        int k = 0;
        for(int i=0;i<=max;i++){
            for(int j=1;j<temp.length;j++){
                if(temp[j]>0){
                    ans[k++] = j;
                    temp[j]--;
                }
            }
        }
        return ans;
    }
}