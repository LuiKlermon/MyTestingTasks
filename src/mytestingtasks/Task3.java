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
public class Task3 {    
    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }    
    
    public static int getLevelSum(Node root, int N) {
        /*
          Please implement this method to
          traverse the tree and return the sum of the values (Node.getValue()) of all nodes
          at the level N in the tree.
          Node root is assumed to be at the level 1. All its children are level 2, etc.
         */
        int sum = 0;
        if(N == 1)
            return root.getValue();
        else{
            for(Node node : root.getChildren())
                sum += getLevelSum(node, N - 1);
        }
        return sum;
    }
}
