package com.schroederlab.primegraphlabeler.impl;

/**
 * Attempts to find a prime labeling for a Product of Cycles graph.
 */
public class ProductofCyclesPrimeLabeler extends AbstractPrimeLabeler {

    private Integer cycleM;
    private Integer cycleN;
    private static final int DEFAULT_CYCLE_LENGTH = 3;

    @Override
    public boolean findPrimeLabeling(boolean printSolutions) {
        return false;
    }
    
    /**
     * Sets the length of cycle M.
     *
     * @param newCycleM Length of cycle M.
     */
    public void setCycleM(int newCycleM) {
        cycleM = newCycleM;
    }

    /**
     * Gets the length of cycle M.
     *
     * @return Length of cycle M. If none is assigned, the default will be
     * returned.
     */
    public int getCycleM() {
        if (cycleM != null) {
            return cycleM;
        } else {
            return DEFAULT_CYCLE_LENGTH;
        }
    }

    /**
     * Sets the length of cycle N.
     *
     * @param newCycleN Length of cycle N.
     */
    public void setCycleN(int newCycleN) {
        cycleN = newCycleN;
    }

    /**
     * Gets the length of cycle N.
     *
     * @return Length of cycle N. If none is assigned, the default will be
     * returned.
     */
    public int getCycleN() {
        if (cycleN != null) {
            return cycleN;
        } else {
            return DEFAULT_CYCLE_LENGTH;
        }
    }
}
