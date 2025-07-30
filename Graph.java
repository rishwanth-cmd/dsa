// Graph Implementation
// import java.util.*;
// public class Graph
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int v = sc.nextInt();
//         int e = sc.nextInt();
//         List<List<Integer>> graph = new ArrayList<>();
//         for(int i=0;i<=v;i++)
//         {
//             graph.add(new ArrayList<>());
//         }
//         for(int i=0;i<e;i++)
//         {
//             int u = sc.nextInt();
//             int w = sc.nextInt();
//             graph.get(u).add(w);
//             graph.get(w).add(u);
//         }
//         System.out.print("Enter starting node for BFS: ");
//         int start = sc.nextInt();
//         for(int i=0;i<=v;i++)
//         {
//             if(!(graph.get(i).isEmpty()))
//             {
//                 System.out.print("Node " + i + " -> ");
//                 for (int neighbor : graph.get(i))
//                 {
//                     System.out.print(neighbor + " ");
//                 }
//                 System.out.println();

//             }
//         }
//     }
// }

// BFS traversal
// import java.util.*;
// public class Graph
// {
//     public static void main(String[] args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int v = sc.nextInt();
//         int e = sc.nextInt();
//         List<List<Integer>> graph = new ArrayList<>();
//         for(int i=0;i<=v;i++)
//         {
//             graph.add(new ArrayList<>());
//         }
//         for(int i=0;i<e;i++)    
//         {
//             int u = sc.nextInt();
//             int w = sc.nextInt();
//             graph.get(u).add(w);
//             graph.get(w).add(u);
//         }
//         int start = sc.nextInt();
//         bfs(graph,v,start);

//     }
//     public static void bfs(List<List<Integer>> graph,int v,int start)
//     {
//         boolean[] visited = new boolean[v+1];
//         Queue<Integer> q = new LinkedList<>();
//         visited[start] = true;
//         q.add(start);
//         while (!q.isEmpty())
//         {
//             int node = q.poll();
//             System.out.print(node +" ");
//             for(int neighbor : graph.get(node))
//             {
//                 if(!visited[neighbor])
//                 {
//                     q.add(neighbor);
//                 }
//             }
//         }
//     }
// }