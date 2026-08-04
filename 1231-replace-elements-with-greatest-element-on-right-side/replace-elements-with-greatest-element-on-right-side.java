class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        int max = arr[arr.length-1];
        ans[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            ans[i] = max;
            max = Math.max(arr[i],max);
        }
        return ans;
    }
}