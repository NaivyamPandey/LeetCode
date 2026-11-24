class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subArray = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                subArray.add(sum);
            }
        }
        Collections.sort(subArray);

        for(Integer i : subArray){
            System.out.print(i + " ");
        }

        long ans = 0;
        for(int i = left - 1; i < right; i++){
            ans += (long)subArray.get(i);
        }
        return (int)(ans % (Math.pow(10,9) + 7));
    }
}