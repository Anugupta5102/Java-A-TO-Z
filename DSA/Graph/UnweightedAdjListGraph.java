package DSA.Graph;
import java.util.ArrayList;
public class UnweightedAdjListGraph {
    /*vertex-node and connection-edge
     * can have disconnected components
     * graphs--->directed, undirected(bidirectional)
     * edge- weighted, unweighted
     * traversals-->BFS(breadth first), DFS(depth first)
     * Graph representation-->Adjacency list(list of list), adjacency matrix, edge list, 2d-matrix
     * Graph size--no of vertex
     * 
     * 1. Adjacency List (efficient,optimised)-->no extra space
     * -->Example     //hashmap / array of arrayList
     * 0->{0,2}       : source,dest---->edge
     * 1->{1,2},{1,3}
     * 2->{2,0},{2,1},{2,3}
     * 3->{3,1},{3,2}
     * ArrayList<edge> graph[v];  
     * 
     * 2. Adjacency Matrix
     *  VxV matrix
     * 1 means edge present and 0 means no edge-->unweighted
     * wt value edge present else 0--->weighted
     * space-O(V^2) and neighbor-O(V)
     * 
     *3. Edge List
     * {{0,2},{1,2},{1,3}}-->{s,d} / {s,d,wt}
     * size=v
     * used in MST-->edges sort
     * 
     * 4. 2D array(Implicit graph)
     * used flood fill algo
     * shortest path
     */
static class Edge{
    int src;
    int dest;

    public Edge(int s,int d){ //unweighted   (src,dest)
        this.src=s;
        this.dest=d;
    }
}

public static void createGraph(ArrayList<Edge> graph[]){
    //initializeie create the arraylist as empty
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<Edge>();
    }
    //add edges to arraylist at ith index of graph array
    graph[0].add(new Edge(0, 2));
    graph[1].add(new Edge(1, 2));
    graph[1].add(new Edge(1, 3));
    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));
    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 2));
}

    public static void main(String[] args) {
        int v=4;//size of graph
        ArrayList<Edge> graph[]=new ArrayList[v];//array of arrayList type=edge
        createGraph(graph);

        //print 2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest+" ");//src is always the vertex itself
    
 
    }
}
     
}
