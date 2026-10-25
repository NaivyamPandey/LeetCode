class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0, rSum = 0, maxScore = 0;
        for(int i = 0; i < k; i++){
            lSum += cardPoints[i];
        }
        maxScore = lSum;
        int rIndex = cardPoints.length - 1;
        for(int i = k - 1; i >= 0; i--){
            lSum -= cardPoints[i];
            rSum += cardPoints[rIndex];
            rIndex--;
            maxScore = maxScore >= (lSum + rSum) ? maxScore : (lSum + rSum);
        }
        return maxScore;
    }
}