/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimsAlgorithm;

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
        
        vList.get(0).addNeighbour(new Edge(3, vList.get(0), vList.get(1)));
        vList.get(0).addNeighbour(new Edge(3, vList.get(0), vList.get(2)));
        vList.get(1).addNeighbour(new Edge(10, vList.get(1), vList.get(2)));
        
        vList.get(1).addNeighbour(new Edge(3, vList.get(1), vList.get(0)));
        vList.get(2).addNeighbour(new Edge(3, vList.get(2), vList.get(0)));
        vList.get(2).addNeighbour(new Edge(10, vList.get(2), vList.get(1)));
        
        Prims p = new Prims(vList);
        p.primsAlgo(vList.get(0));
        p.MST();
    }
    
}
