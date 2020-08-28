/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TopologicalOrder;

/**
 *
 * @author Mrudul
 */
import java.util.*;

public class TopoOrder {
    
    Stack<Vertex> stack;
    
    public TopoOrder(){
        stack = new Stack<>();
    }
    
    public void dfs(Vertex vertex){
        
        vertex.setVisited(true);
        
        for(Vertex v:vertex.getAdjacencyList()){
            if(! v.isVisited()){
                dfs(v);
            }
        }
        
        stack.push(vertex);
    }
    
    public Stack<Vertex> getStack(){
        return stack;
    }
    
}
