package DSA.Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//O(V+E)-TC
public class BFS {
    /* BFS->go(visit) to immediate neighbors first
    * indirect level order
    * use queue and boolean visited array[v]

    => while(!q.isEmpty())
    * curr=q.remove();---->front
    *if(vis[curr]==false)
    * 1. print current
    * 2. vis[curr]=true
    * for(i=0 to graph[curr].size())
    * Edge e=graph[curr].get(i)
    * 3. curr.neighbor--->queue.add(e.dest)
    *  
    */

    public static class Edge{
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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));

    }

    public static void bfs(ArrayList<Edge> graph[],int v){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]= new boolean[v];
        q.add(0);//add starting point

        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
//find neighbors
                for(int i=0;i<graph[curr].size();i++){ 
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        bfs(graph, v);
        System.out.println();
        
    }
    
}
