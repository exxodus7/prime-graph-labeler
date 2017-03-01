package com.schroederlab.primegraphlabeler.impl;

/**
 * Attempts to find a prime labeling for a graph.
 */
public abstract class AbstractPrimeLabeler {

    /**
     * Attempts to find a prime labeling of a graph. Returns when the first
     * result is found, or when there are no more potential solutions.
     *
     * @return True if a prime label was found, false otherwise.
     */
    public boolean findPrimeLabeling() {
        return findPrimeLabeling(false);
    }

    /**
     * Attempts to find a prime labeling of a graph.
     *
     * @param printSolutions Whether or not to print solutions or just to return
     * when the first solution is found.
     * @return True if a prime label was found, false otherwise.
     */
    public abstract boolean findPrimeLabeling(boolean printSolutions);
}
