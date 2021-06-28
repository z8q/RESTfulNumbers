package com.z8q.service;

import java.util.*;

public class FindNumberService {

    public Integer showNumber(int[] arr, int number) {

        int[] numArray = arr;
        int mainNumber = number;
        Map<Integer, Integer> tenMinusElement = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int element : numArray) {
            int x = Math.abs(element - mainNumber);
            tenMinusElement.put(element, x);
        }
        int x = Collections.min(tenMinusElement.values());

        for (Map.Entry element : tenMinusElement.entrySet()) {
            if (element.getValue().equals(x)) {
                list.add((Integer) element.getKey());
            }
        }
        return Collections.max(list);
    }
}
