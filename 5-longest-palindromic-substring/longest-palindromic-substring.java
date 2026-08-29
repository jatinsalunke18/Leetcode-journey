class Solution {
    Boolean isPallindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String ans = "";

        for (int left = 0; left < s.length(); left++) {

            for (int right = s.length() - 1; right >= left; right--) {

                if (right - left + 1 <= ans.length())
                    break;

                if (isPallindrome(s, left, right)) {
                    ans = s.substring(left, right + 1);
                    break;
                }
            }
        }
        return ans;
    }
}