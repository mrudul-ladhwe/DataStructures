/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TopologicalOrder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
        
        TopoOrder tp = new TopoOrder();
        
        List<Vertex> graph = new ArrayList<>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));
        
        graph.get(2).addNeighbour(graph.get(3));
        
        graph.get(3).addNeighbour(graph.get(1));
        
        graph.get(4).addNeighbour(graph.get(0));
        graph.get(4).addNeighbour(graph.get(1));
        
        graph.get(5).addNeighbour(graph.get(0));
        graph.get(5).addNeighbour(graph.get(2));
        
        for(int i=0; i < graph.size(); i++){
            if(! graph.get(i).isVisited()){
                tp.dfs(graph.get(i));
            }
        }
        
        for(int i = 0; i <graph.size(); i++){
            Vertex v = tp.getStack().pop();
            System.out.println(v);
        }
        
    }
    
}
