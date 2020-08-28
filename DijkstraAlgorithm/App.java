/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DijkstraAlgorithm;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
        
        DijkstraAlgo da = new DijkstraAlgo();
        
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        
        v1.addNeighbour(new Edge(2, v1, v2));
        v1.addNeighbour(new Edge(3, v1, v3));
        v1.addNeighbour(new Edge(5, v1, v5));
        
        v2.addNeighbour(new Edge(2, v2, v3));
        v2.addNeighbour(new Edge(4, v2, v4));
        v2.addNeighbour(new Edge(2, v2, v5));
        
        v3.addNeighbour(new Edge(1, v3, v4));
        
        v5.addNeighbour(new Edge(7, v5, v4));
        
        da.computePath(v1);
        
        System.out.println("Path B>>>"+da.path(v2));
        System.out.println("Path C>>>"+da.path(v3));
        System.out.println("Path D>>>"+da.path(v4));
        System.out.println("Path E>>>"+da.path(v5));
    }
    
}
