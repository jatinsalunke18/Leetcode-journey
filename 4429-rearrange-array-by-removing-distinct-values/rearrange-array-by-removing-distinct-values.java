class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp[] = new int[101];
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        int k = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<temp.length;j++){
                if(temp[j]>0){
                    ans[k++] = j;
                    temp[j]--;
                }
            }
        }
        return ans;
    }
}