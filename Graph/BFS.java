package com.company.DSA__JAVA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 4);
//        addEdge(adj, 2, 4);
//        addEdge(adj, 3, 5);
//        addEdge(adj, 3, 6);
//        addEdge(adj, 4, 7);
//        addEdge(adj, 4, 5);
//        addEdge(adj, 5, 2);
//        addEdge(adj, 6, 5);
//        addEdge(adj, 7, 5);
//        addEdge(adj, 7, 8);

        System.out.println(adj);

        System.out.println(bfsOfGraph(5, 1, adj));
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int firstV, int secondV) {
        adj.get(firstV).add(secondV);
        adj.get(secondV).add(firstV);
    }

    static public ArrayList<Integer> bfsOfGraph(int V, int start, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visit = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visit[start] = true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for (Integer it : adj.get(node)) {
                if (!visit[it]){
                    visit[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;
    }

}
