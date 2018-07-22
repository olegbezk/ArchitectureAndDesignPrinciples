package com.udemy.training.creational.factory;

public class App {

    public static void main(String[] args) {
        Algorithm shortestPath = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);
        shortestPath.solve();
        Algorithm spanningTree = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SPANNING_TREE);
        spanningTree.solve();
    }
}
