class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int[ ]> ans = new ArrayList<>();

        int i = 0, j = 0;

        while(i < firstList.length && j < secondList.length){

            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];
            int [ ] section = new int[2];

            if((s1 <= e2 && e1 >= s2) || (e1 >= s2 && s1 <= e2)){
                section[0] = Integer.max(s1, s2);
                section[1] = Integer.min(e1, e2);
                ans.add(section);
            }

            if(e1 < e2)
                i++;
            else if(e1 > e2)
                j++;
            else{
                i++;
                j++;
            }
        }

        return ans.toArray(int[][]::new);

    }
}