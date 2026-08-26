class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int k=0;
        for(int i=0;i<fruits.length;i++){
            int temp = 0;
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                map.put(fruits[k],map.getOrDefault(fruits[k],0)-1);
                if(map.get(fruits[k])==0) map.remove(fruits[k]);
                k++;
            }
                max = Math.max(max,i-k+1);
        }
        return max;
    }
}