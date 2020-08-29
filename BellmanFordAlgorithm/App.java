/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BellmanFordAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
        
        List<Vertex> vList = new ArrayList<>();
        
        vList.add(new Vertex("A"));
        vList.add(new Vertex("B"));
        vList.add(new Vertex("C"));
        vList.add(new Vertex("D"));
        
        List<Edge> eList = new ArrayList<>();
        
        eList.add(new Edge(1, vList.get(0), vList.get(1)));
        eList.add(new Edge(-1, vList.get(0), vList.get(2)));
        eList.add(new Edge(4, vList.get(0), vList.get(3)));
        eList.add(new Edge(2, vList.get(2), vList.get(3)));
        
        BellmanFord bf = new BellmanFord(vList, eList);
        
        bf.bellmanFord(vList.get(0));
        bf.path(vList.get(3));
    
    }
    
}
