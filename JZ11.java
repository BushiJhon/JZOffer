//思路：重点是通过无符号转换将负数转成无符号数

public class Solution {
    public int NumberOf1(int n) {
        int count = 0;

        long num = Integer.toUnsignedLong(n);
        System.out.println(num);

        while(num != 0){
            if(mod(num) == 1)
                count++;
            num=rem(num);
        }

        return count;
    }

    public long mod(long n){
        return n%2;
    }

    public long rem(long n){
        return n/2;
    }
}