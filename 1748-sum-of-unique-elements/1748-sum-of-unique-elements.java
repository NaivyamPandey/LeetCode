class Solution {
    public int sumOfUnique(int[] nums) {
        int[] map = new int[101];
        for(int x : nums){
            map[x]++;
        }
        int sum = 0;
        for(int i = 1; i < map.length; i++){
            if(map[i] == 1)
                sum += i;
        }
        return sum;
    }
}