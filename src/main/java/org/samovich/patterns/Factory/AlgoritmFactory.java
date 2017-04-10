package org.samovich.patterns.Factory;

/**
 * @author Valery Samovich
 * @see
 */
public class AlgoritmFactory {
    public static final int SHORTEST_PATH = 0;
    public static final int SPANNING_TREE = 1;

    public static Algorithm createAlgorithm(int type) {
        switch (type) {
            case SHORTEST_PATH:
                return new ShortestPath();
            case SPANNING_TREE:
                return new SpanningTree();
            default:
                return null;
        }
    }
}
