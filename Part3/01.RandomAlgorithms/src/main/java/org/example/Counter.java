package org.example;

import java.util.*;

public class Counter {

    public int mostCommon(List<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (var number : numbers) {
            if (!map.containsKey(number)) {
                map.put(number, 0);
            }

            var counter = map.get(number);
            map.put(number, counter + 1);
        }

        if (map.isEmpty()) {
            throw new NoSuchElementException();
        }

        int max = Collections.max(map.values());

        PriorityQueue<Integer> common = new PriorityQueue<>();

        for (var entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                common.add(entry.getKey());
            }
        }

        if (common.isEmpty()) {
            throw new NoSuchElementException();
        }

        return common.peek();
    }

    public int firstDuplicate(List<Integer> numbers) {
        Set<Integer> distinct = new HashSet<>();

        for (var number : numbers) {
            if (distinct.contains(number)) {
                return number;
            }

            distinct.add(number);
        }


        return 0;
    }
}
