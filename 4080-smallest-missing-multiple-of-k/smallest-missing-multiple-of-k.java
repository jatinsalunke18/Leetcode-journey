class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] multiples = new int[101];
        for(int i=0;i<nums.length;i++){
            multiples[nums[i]] = 1;
        }
        int j = k;
        while(j<multiples.length && multiples[j]==1) j+=k;
        return j;
    }
}