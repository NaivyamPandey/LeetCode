class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            int wSum = 0;
            for(int j = 0; j < words[i].length(); j++){
                int idx = words[i].charAt(j) - 'a';
                wSum += weights[idx];
            }
            wSum = 122 - (wSum % 26);
            char ch = (char)wSum;
            ans.append(ch);
        }
        return ans.toString();
    }
}