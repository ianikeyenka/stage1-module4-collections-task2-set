package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer : sourceList) {
            set.add(integer);
            if (integer % 2 == 0) {
                int value = integer;
                while (value % 2 == 0) {
                    value /= 2;
                    set.add(value);
                }
            } else {
                set.add(integer * 2);
            }
        }
        return set;
    }
}
