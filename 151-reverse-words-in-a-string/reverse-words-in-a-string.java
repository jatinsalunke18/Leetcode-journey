class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        String[] temp = s.split("\\s+");
        for(int i=temp.length-1;i>=0;i--){
            ans.append(temp[i]+" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}