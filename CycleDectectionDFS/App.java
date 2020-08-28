/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CycleDectectionDFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
    CycleDectection cd = new CycleDectection();
    
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        
        v1.addNeighbour(v2);
        v2.addNeighbour(v3);
        v3.addNeighbour(v1);
        v4.addNeighbour(v1);
        v4.addNeighbour(v5);
        v5.addNeighbour(v6);
        v6.addNeighbour(v4);
        
        List<Vertex> ver = new ArrayList<>();
        
        ver.add(v1);
        ver.add(v2);
        ver.add(v3);
        ver.add(v4);
        ver.add(v5);
        ver.add(v6);
        
        cd.cycle(ver);
        
        
    }
}
