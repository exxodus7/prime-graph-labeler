package com.schroederlab.primegraphlabeler.impl;

/**
 * Attempts to find a prime labeling for a Product of Paths graph.
 */
public class ProductofPathsPrimeLabeler extends AbstractPrimeLabeler {
    
    private Integer pathM;
    private Integer pathN;
    private static final int DEFAULT_PATH_LENGTH = 2;

    @Override
    public boolean findPrimeLabeling(boolean printSolutions) {
        return false;
    }
    
    /**
     * Sets the length of path M.
     *
     * @param newPathM Length of path M.
     */
    public void setPathM(int newPathM) {
        pathM = newPathM;
    }

    /**
     * Gets the length of path M.
     *
     * @return Length of path M. If none is assigned, the default will be
     * returned.
     */
    public int getPathM() {
        if (pathM != null) {
            return pathM;
        } else {
            return DEFAULT_PATH_LENGTH;
        }
    }

    /**
     * Sets the length of path N.
     *
     * @param newPathN Length of path N.
     */
    public void setPathN(int newPathN) {
        pathM = newPathN;
    }

    /**
     * Gets the length of path N.
     *
     * @return Length of path N. If none is assigned, the default will be
     * returned.
     */
    public int getPathN() {
        if (pathN != null) {
            return pathN;
        } else {
            return DEFAULT_PATH_LENGTH;
        }
    }
}
