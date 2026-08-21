class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        if(strs[0].length()==0) return "";
        Arrays.sort(strs);
        String word1 = strs[0];
        String word2 = strs[strs.length-1];
        int i=0;
        while(i<word1.length() && word1.charAt(i)==word2.charAt(i)){
            i++;
        }
        return strs[0].substring(0,i);
    }
}