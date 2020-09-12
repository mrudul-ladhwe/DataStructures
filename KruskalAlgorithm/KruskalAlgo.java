/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class KruskalAlgo {
    
    public double mstWeight = 0;
    
    public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList){
        
        DisjointSet ds = new DisjointSet(vertexList);
        List<Edge> mst = new ArrayList<>();
        
        Collections.sort(edgeList);
        
        for(Edge edge:edgeList){
            
            Vertex u = edge.getSourceVertex();
            Vertex v = edge.getTargetVertex();
            
            if(ds.find(u.getNode()) != ds.find(v.getNode())){
                mst.add(edge);
                ds.Union(u.getNode(), v.getNode());
            }
        }
        
        for(Edge m: mst){
            System.out.println(m.getSourceVertex()+"--"+m.getTargetVertex());
            mstWeight += m.getWeight();
        }
        
    }
    
}
