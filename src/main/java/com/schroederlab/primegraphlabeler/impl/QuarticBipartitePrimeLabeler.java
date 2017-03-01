package com.schroederlab.primegraphlabeler.impl;

/**
 * Attempts to find a prime labeling for a Quartic Bipartite graph.
 */
public class QuarticBipartitePrimeLabeler extends AbstractPrimeLabeler {

    private String fileName;

    @Override
    public boolean findPrimeLabeling(boolean printSolutions) {
        return false;
    }
    
    // Create function for just one graph.
    
    /**
     * Sets the input file name.
     *
     * @param newFileName Input file name.
     */
    public void setFileName(String newFileName) {
        fileName = newFileName;
    }

    /**
     * Gets the input file name.
     *
     * @return Input file name.
     */
    public String getFileName() {
        return fileName;
    }
}