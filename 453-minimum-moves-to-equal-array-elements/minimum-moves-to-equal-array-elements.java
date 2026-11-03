class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int min =  nums[0];
        for(int num:nums){
            min = Math.min(min,num);
        }
        for(int num:nums){
            moves+= num-min;
        }
        return moves;
    }
}