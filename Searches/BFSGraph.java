// This class represents a directed graph using adjacency list
// representation
import java.io.*;
import java.util.*;

class BFSGraph
{
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    BFSGraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    //BFS traversal from source node
    void BFS (int s){
      //create boolean array size of V
      boolean[] visited = new boolean[V];
      LinkedList<Integer> q = new LinkedList<>();

      visited[s]=true;
      q.add(s);

      while(q.size() != 0){
        s = q.poll();
        System.out.println(s);

        //get adjacency list
        Iterator<Integer> i = adj[s].listIterator();
        //find all adjacent.. once done, continue
        while(i.hasNext()){
          int node = i.next();
          if(!visited[node]){
            visited[node] = true;
            q.add(node);
          }
        }
      }
    }

   // Driver method to
   public static void main(String args[])
   {
       BFSGraph g = new BFSGraph(4);

       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 2);
       g.addEdge(2, 0);
       g.addEdge(2, 3);
       g.addEdge(3, 3);

       System.out.println("Following is Breadth First Traversal "+
                          "(starting from vertex 2)");

       g.BFS(2);
   }
}
