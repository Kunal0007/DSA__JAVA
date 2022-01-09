package com.company.DSA__JAVA.Graph;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 2);
        addEdge(adjList, 0, 3);
        addEdge(adjList, 1, 2);

        printGraph(adjList);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adjList, int firstV, int secondV) {
        adjList.get(firstV).add(secondV);
        adjList.get(secondV).add(firstV);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adjList) {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print("Vertex " + i + ":");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" -> " + adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
