package org.lc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {
    public boolean solution(List<Integer> nums) {
        Set<Integer> dups = new HashSet<>();
        for (Integer num : nums) {
            if (dups.contains(num)) {
                return true;
            }
            dups.add(num);
        }
        return false;
    }
}
