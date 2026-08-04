class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind = 0;
        if(ruleKey.equals("type")) ind = 0;
        if(ruleKey.equals("color")) ind = 1;
        if(ruleKey.equals("name")) ind = 2;
        int count = 0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(ind).equals(ruleValue)) count++;
        }
        return count;
    }
}