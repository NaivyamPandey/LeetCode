class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        String open = "({[";
        String close = ")}]";

        for(int i = 0; i < s.length(); i++){
            char ele = s.charAt(i);
            if(open.indexOf(ele) != -1){
                stk.push(ele);
            }
            else{
                if(stk.isEmpty()) return false;

                if(open.indexOf(stk.pop()) != close.indexOf(ele)) return false;
            }
        }

        if(!stk.isEmpty()) return false;

        return true;
    }
}