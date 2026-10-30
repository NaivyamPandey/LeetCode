class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            if(words[i].length() != 0){
                str.append(words[i]);
                str.append(" ");
            }
        }
        str.deleteCharAt(str.length() - 1);
        return str.toString();
    }
}