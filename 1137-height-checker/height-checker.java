class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOf(heights, heights.length);   
        Arrays.sort(copy);
        int count = 0;
        int i=0;
        while(i<heights.length){
            if(copy[i]!=heights[i]) count++;
            i++;
        }
        return count;
    }
}