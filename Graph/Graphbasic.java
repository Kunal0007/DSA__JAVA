package com.company.DSA__JAVA.Graph;

public class Graphbasic {
    int vertices;
    boolean[][] adjMatrix;

    public Graphbasic(int vertices){
        this.vertices = vertices;
        adjMatrix = new boolean[vertices][vertices];
    }

    public void addEdge(int firstV, int SecondV){
        adjMatrix[firstV][SecondV] = true;
        adjMatrix[SecondV][firstV] = true;
    }

    public void removeEdge(int firstV, int SecondV){
        adjMatrix[firstV][SecondV] = false;
        adjMatrix[SecondV][firstV] = false;
    }

   public void printGraph(){
       for (int i = 0; i < vertices; i++) {
           for (int j = 0; j < vertices; j++) {
               if (adjMatrix[i][j]){
                   System.out.print("1 ");
               }
               else {
                   System.out.print("0 ");
               }
           }
           System.out.println();
       }
   }

    public static void main(String[] args) {
        Graphbasic G = new Graphbasic(4);

        G.addEdge(0, 1);
        G.addEdge(0, 2);
        G.addEdge(1, 2);
        G.addEdge(2, 0);
        G.addEdge(2, 3);

        G.printGraph();

    }

}
