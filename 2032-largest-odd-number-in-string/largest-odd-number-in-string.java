class Solution {
    public String largestOddNumber(String num) {
        StringBuilder ans = new StringBuilder(num);
        int i = ans.length()-1;
        while(i>=0 && (ans.charAt(i)-'0')%2==0){
            ans.deleteCharAt(i);
            i--;
        }
        return ans.toString();
    }
}