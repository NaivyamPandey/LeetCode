class Solution {

    public boolean binarySearch(int key, int[] nums){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(key == nums[mid]){
                return true;
            }
            else if(key < nums[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }

    public int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int count = 0, sum = 0;

        for(int i = 1; i <= n && sum < maxSum; i++){
            if(!binarySearch(i, banned)){
                sum += i;
                count++;
            }
        }

        if(sum > maxSum) return --count;

        return count;
    }
}