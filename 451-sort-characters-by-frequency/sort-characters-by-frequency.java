class Solution {
    public String frequencySort(String s) {
        int freq[] = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'\0']++;
        }
        HashMap<Integer,List<Character>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                set.add(freq[i]);
                map.put(freq[i],new ArrayList<>());
            }
        }
        List<Integer> sortedSet = new ArrayList<>(set);
        Collections.sort(sortedSet);
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                map.get(freq[i]).add((char)i);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=sortedSet.size()-1;i>=0;i--){
            for(int j=0;j<map.get(sortedSet.get(i)).size();j++){
                char ch = map.get(sortedSet.get(i)).get(j);
                for(int k=0;k<sortedSet.get(i);k++){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}