/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestingtasks;
import java.util.*;
/**
 *
 * @author Sergey
 */
public class Task2 {

    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
        Set<Object> res = new HashSet<>(a);
        if(res.retainAll(b))
            return res;
        else
            return null;
    }
}
