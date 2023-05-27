package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        for (Integer integer : sourceList) {
            if (Math.pow(integer, 2) >= lowerBound && Math.pow(integer, 2) <= upperBound) {
                set.add((int) Math.pow(integer, 2));
            }
        }
        return set;
    }
}
