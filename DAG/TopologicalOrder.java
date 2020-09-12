/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAG;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Mrudul
 */
public class TopologicalOrder {
    
    public Stack<Vertex> stack;

    public TopologicalOrder() {
        this.stack = new Stack<>();
    }
    
    public void topoSort(List<Vertex> vertexList){
        
        for(Vertex v: vertexList){
            if(! v.isVisited()){
                dfs(v);
            }
        }
    }

    private void dfs(Vertex vertex) {
        
        vertex.setVisited(true);
        
        for(Edge e:vertex.getAdjacencyList()){
            if(! e.getTargetVertex().isVisited()){
                e.getTargetVertex().setVisited(true);
                dfs(e.getTargetVertex());
            }
        }
        
        this.stack.push(vertex);
    }
    
    public Stack<Vertex> getOrder(){
        Collections.reverse(stack);
        return this.stack;
    }
    
}
