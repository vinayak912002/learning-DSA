package dynamic_programming;

import java.util.HashMap;

//to avoid recomputing various values we are going to use memoisation
//in memoisation we save the outputs of certain calls in a recursion so that we would not need to compute it again and again
//we will save the values in a hashmap because it is the fastest DS to traverse and modify.(we are trying to reduce the time taken)
public class Fibonacci {
    //this function returns the n+1th fibonacci number
    public static int fib(int n, HashMap<Integer,Integer> memo){
        //base case
        if(n == 0 || n == 1){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int val = fib(n-1, memo) + fib(n-2, memo);
        memo.put(n, val);
        return val;//still returning the same value but saving the value in a hashMap before returning
    }

    public static void main(String[] args) {
        System.out.println(fib(5,new HashMap<Integer, Integer>()));
    }
}
