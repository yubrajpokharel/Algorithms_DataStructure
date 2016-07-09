package com.Graphs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by yubraj on 7/9/16.
 */
public class Graph_BFS_DFS {

    private int vertices;
    private LinkedList[] adj;

    private Graph_BFS_DFS(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList();
        }
    }

    private void add(int v, int e){
        adj[v].add(e);
    }

    public void bfs(int vertex){
        // make all vertices as marked false at the begining
        boolean visited[] = new boolean[vertices];

        // create a queue
        LinkedList<Integer> queue = new LinkedList<>();

        //mark the starting vertex as travelled
        visited[vertex] = true;

        // add this vertix to the queue
        queue.add(vertex);

        while (queue.size() != 0){
            vertex = queue.poll();
            System.out.print(vertex + " --> ");
            Iterator<Integer>  iterator = adj[vertex].iterator();

            while (iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // DFS from certain node ------------------------------------------------

    public void dfsFromCertainNode(int vertex){
        boolean isVisited[] = new boolean[vertices];
        //isVisited[vertex] = true;
        dfsFromCertainNodeImpl(vertex, isVisited);
    }

    public void dfsFromCertainNodeImpl(int vertex, boolean[] isVisited) {
        isVisited[vertex] = true;
        System.out.print(vertex + " --> ");
        Iterator<Integer> iterator = adj[vertex].iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if(isVisited[n]==false){
                dfsFromCertainNodeImpl(n, isVisited);
            }
        }
    }
    // DFS from certain node ------------------------------------------------


    // DFS Entire Graph  ----------------------------------------------------

    private void dfsWhole(){
        boolean isVisited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (isVisited[i] == false)
                dfsWholeImpl(i, isVisited);

        }
    }


    private void dfsWholeImpl(int i, boolean[] isVisited) {
        isVisited[i] = true;
        System.out.print(i + " --> ");
        Iterator<Integer> iterator = adj[i].iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if(!isVisited[n])
                dfsWholeImpl(n, isVisited);
        }
    }

    // DFS Entire Graph  ----------------------------------------------------

    public static void main(String args[])
    {
        Graph_BFS_DFS g = new Graph_BFS_DFS(4);
        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 2);
        g.add(2, 0);
        g.add(2, 3);
        g.add(3, 3);

        System.out.println("Following is Breadth First Traversal "+"(starting from vertex 2)");
        g.bfs(2);

        System.out.println("\n\nDepth First using Certain Vertex");
        g.dfsFromCertainNode(2);

        System.out.println("\n\nDepth First whole Tree");
        g.dfsWhole();
    }

}
