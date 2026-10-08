class Solution {

    public int calculate(int opr1, int opr2, String operator){
        switch(operator){
            case "+": return opr1 + opr2;
            case "-": return opr1 - opr2;
            case "*": return opr1 * opr2;
            case "/": return opr1 / opr2;
            default: return 0;
        }
    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++){
            String element = tokens[i];

            if(!(element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/"))){
                int num = Integer.parseInt(element);
                stack.push(num);
            }
            else{
                int opr2 = stack.pop();
                int opr1 = stack.pop();
                int num = calculate(opr1, opr2, element);
                stack.push(num);
            }
        }
        if(!stack.isEmpty())
            return stack.pop();
        
        return 0;
    }
}