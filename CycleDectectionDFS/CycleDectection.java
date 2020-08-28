/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CycleDectectionDFS;

import java.util.List;

/**
 *
 * @author Mrudul
 */
public class CycleDectection {
    
    public void cycle(List<Vertex> vList){
        
        for(Vertex v:vList){
            if(! v.isVisited()){
                dfs(v);
            }
        }
    }
    
    public void dfs(Vertex v){
        
        System.out.println("vertex>>"+ v);
        v.setBeingVisited(true);
        
        for(Vertex v1:v.getAdjacencyList()){
            if( v1.isBeingVisited()){
                System.out.println("There is a cycle");
                return;
            }
            
            if(! v1.isVisited()){
                v1.setVisited(true);
                dfs(v1);
            }
        }
        
        v.setBeingVisited(false);
        v.setVisited(true);
    }
    
}
