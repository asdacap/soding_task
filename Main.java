import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        long[] dp = new long[3];
        dp[0] = 1;
        dp[1] = 1;

        int i = 2;
        long total = 0;
        while(true) {
            long cur = dp[(i-1+3)%3] + dp[(i-2+3)%3];
            if(cur > 4000000) break;

            if (cur%2 == 0){
                total += cur;
            }

            dp[i%3] = cur;
            i++;
        }

        System.out.println(total);
    }
}

