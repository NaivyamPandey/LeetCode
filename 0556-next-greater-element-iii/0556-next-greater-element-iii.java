class Solution {
    public int nextGreaterElement(int n) {

        if(n < 10) return -1;
        int brkpt = -1;

        StringBuilder num = new StringBuilder().append(n);

        for(int i = num.length() - 1; i > 0; i--){
            int x1 = num.charAt(i) - '0';
            int x0 = num.charAt(i - 1) - '0';
            if(x0 < x1){
                brkpt = i-1;
                break;
            }
        }

        if(brkpt == -1) return -1;
        else{
            for(int i = num.length() - 1; i > brkpt; i--){
                int x = num.charAt(i) - '0';
                int y = num.charAt(brkpt) - '0';
                if(x > y){
                    char temp = num.charAt(i);
                    num.setCharAt(i, num.charAt(brkpt));
                    num.setCharAt(brkpt, temp);
                    break;
                }
            }

            int i = brkpt + 1, j = num.length() - 1;
            while(i < j){
                char temp = num.charAt(i);
                num.setCharAt(i, num.charAt(j));
                num.setCharAt(j, temp);
                i++;
                j--;
            }
        }

        long result = Long.parseLong(num.toString());

        if(result > Integer.MAX_VALUE) return -1;

        return (int)result;
    }
}