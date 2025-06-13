package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;
public class TopologicalSort {
    /*only used for Directed Acyclic graph(DAG)---->dir and no cycle
     * linear order of vertices u->v
     * Dependency
     * use DFS and stack(lifo)--->store 1st neighbors then curr
     * O(V+E)
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
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5,2));

     }
//modified DFS
     public static void topSort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr); //first push neighbors
     }

     public static void sort(ArrayList<Edge> graph[],int v){
        boolean vis[]=new boolean[v];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                topSort(graph, i, vis, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() +" "); 
            
        }
     }


     public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        
        sort(graph, v);


     }
}
