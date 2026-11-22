class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b')
                flag = true;

            if(flag == true && s.charAt(i) != 'b')
                return false;
        }
        return true;
    }
}