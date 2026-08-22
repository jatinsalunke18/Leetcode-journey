class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        if(s.charAt(left)!=s.charAt(right)) return (right-left)+1;
        while(left<right){
            while(left<right && s.charAt(left)==s.charAt(left+1)) left++;
            while(left<right && s.charAt(right)==s.charAt(right-1)) right--;
            left++;
            right--; 
            if(left<=right && s.charAt(left)!=s.charAt(right)) return (right-left)+1;
        }
        if(left>right) return 0;
        return right-left+1;
    }
}