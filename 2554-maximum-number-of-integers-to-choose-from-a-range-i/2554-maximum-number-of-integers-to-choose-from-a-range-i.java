class Solution {

    public int maxCount(int[] banned, int n, int maxSum) {
        
        Set<Integer> set = new HashSet<>();
        int count = 0, sum = 0;

        for(int i = 0; i < banned.length; i++){
            set.add(banned[i]);
        }

        for(int i = 1; i <= n && sum < maxSum; i++){
            if(!set.contains(i)){
                sum += i;
                count++;
            }
        }

        if(sum > maxSum) count--;

        return count;
    }
}