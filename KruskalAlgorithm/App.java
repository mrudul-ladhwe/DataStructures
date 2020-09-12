/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
        
        List<Vertex> vList = new ArrayList<>();
        List<Edge> eList = new ArrayList<>();
        
        vList.add(new Vertex("A"));
        vList.add(new Vertex("B"));
        vList.add(new Vertex("C"));
        vList.add(new Vertex("D"));
        vList.add(new Vertex("E"));
        vList.add(new Vertex("F"));
        vList.add(new Vertex("G"));
        vList.add(new Vertex("H"));
        
        eList.add(new Edge(3, vList.get(0), vList.get(1)));
        eList.add(new Edge(2, vList.get(0), vList.get(2)));
        eList.add(new Edge(5, vList.get(0), vList.get(3)));
        eList.add(new Edge(13, vList.get(1), vList.get(5)));
        eList.add(new Edge(2, vList.get(1), vList.get(3)));
        eList.add(new Edge(5, vList.get(2), vList.get(4)));
        eList.add(new Edge(2, vList.get(2), vList.get(3)));
        eList.add(new Edge(4, vList.get(3), vList.get(4)));
        eList.add(new Edge(6, vList.get(3), vList.get(5)));
        eList.add(new Edge(3, vList.get(3), vList.get(6)));
        eList.add(new Edge(6, vList.get(4), vList.get(6)));
        eList.add(new Edge(2, vList.get(5), vList.get(6)));
        eList.add(new Edge(3, vList.get(5), vList.get(7)));
        eList.add(new Edge(6, vList.get(6), vList.get(7)));
        
        KruskalAlgo ka = new KruskalAlgo();
        ka.spanningTree(vList, eList);
        System.out.println("MST weight>>>"+ka.mstWeight);
        
    }
    
}
