class Solution {

    public int genNext(int n){
        int sum = 0;
        while(n != 0){
            int num = n%10;
            sum += (num * num);
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;

        do{
            slow = genNext(slow);
            fast = genNext(genNext(fast));
        }while(slow != fast);

        return slow == 1;

    }
}