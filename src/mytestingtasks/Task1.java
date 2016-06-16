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

public class Task1 {

    public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
        Object[] b = new Object[a.length];
        for(int i = 0;i < a.length;i++)
            b[i] = a[a.length - i - 1];
        return b;
    }
}
