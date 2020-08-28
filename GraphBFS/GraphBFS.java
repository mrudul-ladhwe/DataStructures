/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphBFS;
import java.util.*;

public class GraphBFS {
    
    public void traverse(Vertex root){
        
        Queue<Vertex> queue = new LinkedList<>();
        
        root.setVisited(true);
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            Vertex actualV = queue.remove();
            System.out.println("Vertex>>>"+actualV);
            
            for(Vertex v:actualV.getAdjacencyList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
        
    }
        
    
    
}

