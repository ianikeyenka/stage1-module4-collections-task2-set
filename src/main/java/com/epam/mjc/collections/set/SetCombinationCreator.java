package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstPart = new HashSet<>(firstSet);
        firstPart.retainAll(secondSet);
        firstPart.removeAll(thirdSet);
        Set<String> secondPart = new HashSet<>(thirdSet);
        secondPart.removeAll(firstSet);
        secondPart.removeAll(secondSet);
        secondPart.addAll(firstPart);
        return secondPart;
    }
}
