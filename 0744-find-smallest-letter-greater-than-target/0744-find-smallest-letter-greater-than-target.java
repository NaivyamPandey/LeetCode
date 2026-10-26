class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++){
            int y = letters[i] - '0';
            int z = target - '0';
            if(y > z){
                return letters[i];
            }
        }
        return letters[0];
    }
}