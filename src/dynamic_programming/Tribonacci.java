package dynamic_programming;

import java.util.HashMap;

public class Tribonacci {
    //in this sequence the sum of the last three digits give the next digit
    //we have to do it recursively and using the principles of dynamic programming
    public static int trib(int n, HashMap<Integer, Integer> memo){
        //f(0) = 0 first term is 0
        //f(1) = 1 second term is 1
        if (n == 0 || n == 1){
            return n;
        }
        //f(2) = 1 third term is also 1
        //draw the recursion tree to look -- f(3) = f(2)+f(1)+f(0) the tree will not expand any further with positive terms
        if (n==2) return 1;

        if(memo.containsKey(n)) return (memo.get(n));

        int value = trib(n-1, memo) + trib(n-2, memo)+ trib(n-3, memo);

        memo.put(n, value);
        return value;
    }

    public static void main(String[] args) {
        System.out.println(trib(50, new HashMap<>()));
    }
}
