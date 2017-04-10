package org.samovich.patterns.Factory;

/**
 * @author Valery Samovich
 * @see
 */
public class App {

    public static void main(String[] args) {
        Algorithm algorithm = AlgoritmFactory.createAlgorithm(AlgoritmFactory.SHORTEST_PATH);
        algorithm.solveProblem();
    }

}
