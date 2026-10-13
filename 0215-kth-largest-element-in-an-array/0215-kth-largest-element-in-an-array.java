class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            pq.offer(nums[i]);
        }
        int count = 0;
        int s = pq.size();
        while (!pq.isEmpty()) {
            count++;
            if (count == s - k + 1)
                return pq.poll();
            pq.poll();
        }
        return 0;
    }
}