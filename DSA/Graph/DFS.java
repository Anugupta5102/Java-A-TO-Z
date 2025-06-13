package DSA.Graph;

import java.util.ArrayList;
//O(E+V)
public class DFS {
    /*keep going to the 1st neighbor of current
    ==> Use Recursion
     * 1. void dfs(graph, curr, vis[])
     * 2. print curr
     * 3. vis[curr]=t
     * 4. for(i=0 to grapgh[curr].size)
     * 5. edge e=graph[curr].get(i)
     * 6. dfs(graph,e.dest,vis)
     */
    public static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src=s;
            this.dest=d;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));

    }
    
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false)
            dfs(graph, e.dest, vis);
        }
    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        boolean vis[]=new boolean[v];
        dfs(graph,0,vis);
        System.out.println();
    }


}
