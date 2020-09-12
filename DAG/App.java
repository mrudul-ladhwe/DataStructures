/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAG;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
        
        List<Vertex> vList = new ArrayList<>();
        
        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");
        
        vList.add(v0);
        vList.add(v1);
        vList.add(v2);
        
        v0.addNeighbour(new Edge(1, v0, v1));
        v0.addNeighbour(new Edge(10, v0, v2));
        v1.addNeighbour(new Edge(1, v1, v2));
        
        DAGAlgo dag = new DAGAlgo();
        dag.shortestPath(vList, v0, v2);
        dag.showShortestPath(v2);
    }
    
}
