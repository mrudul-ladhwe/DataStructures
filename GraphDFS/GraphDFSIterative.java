/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphDFS;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Mrudul
 */
public class GraphDFSIterative {
    
    Stack<Vertex> stack;
    
    public GraphDFSIterative(){
        this.stack = new Stack<>();
    }
    
    public void dfs(List<Vertex> vList){
        
        //loop for multiple clusters
        for(Vertex v:vList){
            if(!v.isVisited()){
                v.setVisited(true);
                dfsWithStack(v);
            }
        }
    }
    
    public void dfsWithStack(Vertex v){
        
        this.stack.add(v);
        v.setVisited(true);
        
        while(!stack.isEmpty()){
            
            Vertex actual = this.stack.pop();
            System.out.println("Vertex>>"+actual);
            
            for(Vertex ver:actual.getAdjacencyList()){
                if(!ver.isVisited()){
                ver.setVisited(true);
                this.stack.push(ver);
                }
            }
        }
    }
    
}
