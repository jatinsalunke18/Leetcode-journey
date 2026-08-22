class Solution {
    public int maxOperations(int[] arr, int k) {
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem = k - arr[i];
            if(map.containsKey(rem)){
                    cnt++;
                    map.put(rem,map.get(rem)-1);
                    if(map.get(rem)==0) map.remove(rem);
            }
            else map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }
}