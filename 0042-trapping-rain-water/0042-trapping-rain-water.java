class Solution {
    public int trap(int[] height) {

        int s = height.length;

        int[] preMax = new int[s];
        int[] suffMax = new int[s];

        preMax[0] = height[0];
        suffMax[s - 1] = height[s - 1];
        int i = 1, j = s - 2, ans = 0;

        while(i < s && j >= 0){
            preMax[i] = Integer.max(preMax[i-1], height[i]);
            suffMax[j] = Integer.max(suffMax[j + 1], height[j]);
            i++;
            j--;
        }

        // System.out.println("PreMax");
        // for(i = 0; i < s; i++){
        //     System.out.print(preMax[i] + " ");
        // }
        // System.out.println();
        // System.out.println("SuffMax");
        // for(i = 0; i < s; i++){
        //     System.out.print(suffMax[i] + " ");
        // }

        for(i = 1; i < s - 1; i++){
            int minHeight = Integer.min(preMax[i-1], suffMax[i+1]);
            if(minHeight > height[i])
                ans += minHeight - height[i];
        }

        return ans;
    }
}