
// without prefix Max

class Solution {
    public int trap(int[] height) {

        int s = height.length;

        int[] suffMax = new int[s];

        suffMax[s - 1] = height[s - 1];
        int j = s - 2, ans = 0;

        while(j >= 0){
            suffMax[j] = Integer.max(suffMax[j + 1], height[j]);
            j--;
        }

        // System.out.println("SuffMax");
        // for(i = 0; i < s; i++){
        //     System.out.print(suffMax[i] + " ");
        // }

        int preMax = height[0];

        for(int i = 1; i < s - 1; i++){
            int minHeight = Integer.min(preMax, suffMax[i+1]);
            if(minHeight > height[i])
                ans += minHeight - height[i];

            preMax = preMax > height[i] ? preMax : height[i];
        }

        return ans;
    }
}