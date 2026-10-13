class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x , map.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for(int key : map.keySet()){
            pq.offer(key);
        }

        int[] res = new int[k];

        for(int i = 0; i < res.length; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}