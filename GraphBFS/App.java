/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphBFS;

/**
 *
 * @author Mrudul
 */
public class App {
    
    public static void main(String[] args){
        GraphBFS bfs = new GraphBFS();
        
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");
        
        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);
        
        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);
        
        d.addNeighbour(b);
        d.addNeighbour(e);
        
        f.addNeighbour(a);
        
        g.addNeighbour(a);
        g.addNeighbour(h);
        
        h.addNeighbour(g);
        
        bfs.traverse(a);
    }
    
}
