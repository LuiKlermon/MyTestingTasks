/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestingtasks;

/**
 *
 * @author Sergey
 */
public class Task4 {

    static int factorial(int n){
        int res = 1;
        for(int i = 1;i <= n;i++){
            res *= i;
        }
        return res;
    }
    static int countComb(int k, int n){
        return factorial(n)/(factorial(n - k) * factorial(k));
    }
    public static int countWaysToJump(int N) {
        /*
          A set of stairs has N steps.
          You can jump either 1 or 2 steps at a time.
          For example, if the stairs is N=4 steps, you can reach the end in 5 possible ways:
          1-1-1-1, or 1-2-1 or 1-1-2 or 2-1-1 or 2-2
          Please implement this method to
          return the count of the different ways to reach the end of the stairs with N steps.
         */
        int i = 0;
        int j = N;
        int res = 0;
        while(i <= j){
            res += countComb(i, j);
            i++;
            j--;
        }        
        return res;
    }
}