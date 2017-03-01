package com.schroederlab.primegraphlabeler.impl;

/**
 * Attempts to find a prime labeling for a Cycle K graph.
 */
public class CycleKPrimeLabeler extends AbstractPrimeLabeler {

    private Integer numVertices;
    private Integer startingLabel;
    private static final int DEFAULT_NUMBER_OF_VERTICES = 3;
    private static final int DEFAULT_STARTING_LABEL = 1;

    @Override
    public boolean findPrimeLabeling(boolean printSolutions) {
        // For each cut
        //  label
        //  test
        //  if prime && printSolutions == false
        //      return true
        //  if prime && printSolutions == true
        //      print, continue
        return false;
    }

    /**
     * Checks whether a labeling is prime.
     *
     * @param labeling Array representation of the labeling. Adjacent items in
     * the array, as well as the first and last items, are adjacent in the
     * graph.
     * @return True if the labeling is prime, false otherwise.
     */
    private boolean checkLabeling(int[] labeling) {
        // no two adjacent verticies can have a common factor
        return false;
    }

    /**
     * Sets the number of vertices on the graph to be labeled.
     *
     * @param newNumVertices Number of vertices.
     */
    public void setNumVertices(int newNumVertices) {
        numVertices = newNumVertices;
    }

    /**
     * Gets the number of vertices on the graph to be labeled.
     *
     * @return Number of vertices. If none is assigned, the default will be
     * returned.
     */
    public int getNumVertices() {
        if (numVertices != null) {
            return numVertices;
        } else {
            return DEFAULT_NUMBER_OF_VERTICES;
        }
    }

    /**
     * Sets the starting label on the graph to be labeled.
     *
     * @param newStartingLabel Starting label.
     */
    public void setStartingLabel(int newStartingLabel) {
        startingLabel = newStartingLabel;
    }

    /**
     * Gets the starting label on the graph to be labeled.
     *
     * @return Starting label. If none is assigned, the default will be
     * returned.
     */
    public int getStartingLabel() {
        if (startingLabel != null) {
            return startingLabel;
        } else {
            return DEFAULT_STARTING_LABEL;
        }
    }
}
