package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;

//O(V+E)
public class KosarajuSCC {
    /*SCC (Strongly connected components )--> one node se har dusre node par ja sake scc k andr
     * Kosaraju's algo
     * Directed graph
     * 1. get node in stack(topological sort)
     * 2. transpose graph-->reversing edges
     * 3. DFS acc to stack nodes on transpose graph
     * 'reverse DFS'
     */
    public static class  Edge {
        int src;
        int dest;

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
     public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
     }

     public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");


        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }

     }

     public static void topSort(ArrayList<Edge> graph[],Stack<Integer> stack,int curr,boolean vis[]){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, stack, e.dest, vis);
            }
        }
        stack.push(curr);
     }

     public static void kosarajuAlgo(ArrayList<Edge> graph[],int V){
        //step 1
        Stack<Integer> stack=new Stack<>();
        boolean vis[]=new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph,stack,i,vis);
            }
        }

        //step 2
        ArrayList<Edge> transpose[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false; //reinitialize
            transpose[i]=new ArrayList<Edge>();
     }
     for(int i=0;i<V;i++){//for each vertex
        for(int j=0;j<graph[i].size();j++){//go to its neighbor
            Edge e=graph[i].get(j);//e.src->e.dest
            transpose[e.dest].add(new Edge(e.dest, e.src));//reverse edges
        }
     }

     //step 3

     while (!stack.isEmpty()) {
        int curr=stack.pop();
        if(!vis[curr]){
            dfs(transpose, curr, vis);
            System.out.println();

        } 
     }

    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        kosarajuAlgo(graph, V);
    }



}
